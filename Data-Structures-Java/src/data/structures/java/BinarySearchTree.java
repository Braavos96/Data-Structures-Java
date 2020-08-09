/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data.structures.java;

import java.util.ArrayList;
import java.util.Collection;

/**
 *
 * @author Braavos
 */
public class BinarySearchTree implements IBinaryTree {

    class TreeNode {

        Module data;
        TreeNode left;
        TreeNode right;

        public TreeNode(Module data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    private TreeNode root;

    private void balanceTree() {
        //if size of tree is divisible without a remainder then restructure tree
        if (root == null) {
            System.out.println("Empty Tree");
        } else {
            //get all elements of the tree and create a new tree
            root = createNewTree(null, 0, size(), (ArrayList<Module>) headSet());
        }
    }

    private TreeNode createNewTree(TreeNode t, int low, int high, ArrayList<Module> values) {
        if (low == high) {
            return null;
        }
        //get mid element at set as root
        int mid = (low + high) / 2;
        t = insertModule(t, values.get(mid));
        if (t != null) {
            createNewTree(t, mid + 1, high, values);
            createNewTree(t, low, mid, values);
        }
        return t;
    }

    @Override
    public void add(Module module) {
        //add element to tree
        root = insertModule(root, module);
        if (size() % 3 == 0) {
            //if size of tree is divisible without a remainder then restructure tree
            balanceTree();
        }
    }

    private TreeNode insertModule(TreeNode t, Module m) {
        if (t == null) {// add to head
            t = new TreeNode(m);
        } else if (m.getModuleID().compareToIgnoreCase(t.data.getModuleID()) > 0) { //add to left branch
            t.right = insertModule(t.right, m);
        } else if (m.getModuleID().compareToIgnoreCase(t.data.getModuleID()) < 0) { //add to right branch
            t.left = insertModule(t.left, m);
        }//do nothing if equal
        return t;
    }

    @Override
    public void clear() {
        //clear the list
        root = null;
    }

    @Override
    public boolean contains(String moduleID) {
        //check if id exists in list
        return getModule(moduleID) != null;
    }

    @Override
    public Module getModule(String moduleID) {
        return findModule(root, moduleID);
    }

    private Module findModule(TreeNode t, String moduleID) {
        //iterate through tree to find and return selected module
        Module getModule = null;
        if (t != null) {
            if (t.data.getModuleID().equals(moduleID)) {
                getModule = t.data;
            } else if (moduleID.compareToIgnoreCase(t.data.getModuleID()) > 0) { //left branch
                getModule = findModule(t.right, moduleID);
            } else if (moduleID.compareToIgnoreCase(t.data.getModuleID()) < 0) { //right branch
                getModule = findModule(t.left, moduleID);
            }
        }
        return getModule;
    }

    @Override
    public Collection<Module> headSet() {
        //get all elements in the tree
        ArrayList<Module> modules = new ArrayList<>();
        inOrderTraversal(root, modules);
        return modules;
    }

    private void inOrderTraversal(TreeNode t, Collection modules) {
        //traverse through the tree and add nodes into the collection
        if (t != null) {
            inOrderTraversal(t.left, modules);
            modules.add(t.data);
            inOrderTraversal(t.right, modules);
        }
    }

    @Override
    public boolean isEmpty() {
        //check if list is empty
        return root == null;
    }

    @Override
    public Module remove(String moduleID) {
        //remove selected module
        return reassign(root, root, moduleID, null);
    }

    private Module reassign(TreeNode child, TreeNode parent, String moduleID, Module removed) {
        if (moduleID.compareToIgnoreCase(child.data.getModuleID()) < 0) {//left
            //iterate through the tree and find the selected treenode
            removed = reassign(child.left, child, moduleID, removed);
        } else if (moduleID.compareToIgnoreCase(child.data.getModuleID()) > 0) {//right
            removed = reassign(child.right, child, moduleID, removed);
        } else if (child.data.getModuleID().equals(moduleID)) {
            removed = child.data;

            if (child.left != null && child.right != null) {
                //if treenode has two children
                if (child.left.right == null) {
                    child.data = child.left.data;
                    child.left = child.left.left;
                } else {
                    child.data = bestChoice(child.left, child).data;
                }
            } else if (child.right != null) {//if single branch right
                child = child.right;
            } else if (child.left != null) {//if single branch left
                child = child.left;
            } else { // leaf
                //use parent to make child null if leaf
                if (parent.right.data.getModuleID().equals(child.data.getModuleID())) {
                    parent.right = null;
                } else if (parent.left.data.getModuleID().equals(child.data.getModuleID())) {
                    parent.left = null;
                }
            }
        }
        return removed;
    }

    private TreeNode bestChoice(TreeNode t, TreeNode p) {
        //iterate through the tree and find the next best option to replace the deleted treenode
        if (t.right == null) {
            if (t.left == null) {
                p.right = null;
            } else {
                p.right = t.left;
            }
            return t;
        } else {
            return bestChoice(t.right, t);
        }
    }

    private int count(TreeNode t) {
        //iterate through the tree and find tree size
        return t == null ? 0 : (1 + count(t.left) + count(t.right));
    }

    @Override
    public int size() {
        //return list size
        return count(root);
    }

    private int depth(TreeNode t) {
        if (t == null) {
            //if tree is null
            return -1;
        } else if (t.left == null && t.right == null) {
            //if tree has one node
            return 0;
        } else {//tree is not null and has children
            int leftBranch = depth(t.left);
            int rightBranch = depth(t.right);
            if (leftBranch > rightBranch) {
                return (leftBranch + 1);
            } else {
                return (rightBranch + 1);
            }
        }
    }

    public void printll() {
        //print tree
        printBinaryTree(root, 0);
    }

    /**
     * Reference -
     * http://stackoverflow.com/questions/4965335/how-to-print-binary-tree-diagram
     */
    private void printBinaryTree(TreeNode root, int level) {
        if (root == null) {
            return;
        }
        printBinaryTree(root.right, level + 1);
        if (level != 0) {
            for (int i = 0; i < level - 1; i++) {
                System.out.print("|\t");
            }
            System.out.println("|-------" + root.data.getModuleID());
        } else {
            System.out.println(root.data.getModuleID());
        }
        printBinaryTree(root.left, level + 1);
    }
}
