/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data.structures.java;

/**
 *
 * @author Braavos
 */
public class LinkedList implements ILinkedList {

    class Node {

        Module data;
        Node next;
    }

    private Node root;

    @Override
    public void add(Module module) {
        //add element to list
        Node newNode = new Node();
        newNode.data = module;
        if (root == null || root.data.getModuleID().compareToIgnoreCase(module.getModuleID()) > 0) {
            //if list is null or id is smaller than first then add to first position
            addFirst(module);
        } else if (root != null) {
            Node current = root;
            Node after = current.next;
            while (after != null && after.data.getModuleID().compareToIgnoreCase(module.getModuleID()) < 0) {
                //iterate through list until element is greater than pervious and smaller than next
                current = after;
                after = after.next;
            }
            newNode.next = current.next;
            current.next = newNode;
        }
    }

    @Override
    public void addFirst(Module module) {
        //add module to the start of the list
        Node newNode = new Node();
        newNode.data = module;
        newNode.next = root;
        root = newNode;
    }

    @Override
    public void addLast(Module module) {
        //add module to the end of the list
        Node newNode = new Node();
        newNode.data = module;
        Node current = getPenultimateNode();
        current.next.next = newNode;
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
        //iterate through list to find and return selected module
        Module getModule = null;
        Node current = root;
        while (current != null && getModule == null) {
            if (current.data.getModuleID().equals(moduleID)) {
                getModule = current.data;
            }
            current = current.next;
        }
        return getModule;
    }

    @Override
    public Module getFirstModule() {
        //return first module
        return root.data;
    }

    @Override
    public Module getLastModule() {
        //return last node
        return getPenultimateNode().next.data;
    }

    private Node getPenultimateNode() {
        //iterate through and return penunltimate node
        if (root != null) {
            Node current = root;
            Node after = current.next;
            while (current != null) {
                if (after.next == null) {
                    return current;
                }
                current = after;
                after = after.next;
            }
        }
        return null;
    }

    @Override
    public Module remove(String moduleID) {
        //remove selected module
        Module delNode = null;
        if (root.data.getModuleID().equals(moduleID) && root.next != null) {
            delNode = removeFirstModule();
        } else {
            delNode = removeMiddleModule(moduleID);
        }
        return delNode;
    }

    private Module removeMiddleModule(String moduleID) {
        //iterate through and delete and return deleted module
        Module delNode = null;
        if (root.next == null) {
            //if list is has one or no nodes
            delNode = root.data;
            root = null;
        } else {
            Node current = root;
            Node after = current.next;
            while (current != null && delNode == null) {
                if (after.data.getModuleID().equals(moduleID)) {
                    //check if next node id is equal to selected id
                    delNode = after.data;
                    //if next node is null this is the end of the list.
                    if (after.next != null) {
                        current.next = after.next;
                    } else if (after.next == null) {
                        current.next = null;
                    }
                }
                current = after;
                after = after.next;
            }
        }
        return delNode;
    }

    @Override
    public Module removeFirstModule() {
        //delete first element
        Module delNode = null;
        if (root != null) {
            delNode = root.data;
            root = root.next;
        }
        return delNode;
    }

    @Override
    public Module removeLastModule() {
        //delete last element
        Module delNode = null;
        if (root != null) {
            Node current = getPenultimateNode();
            delNode = current.next.data;
            current.next = null;
        }
        return delNode;
    }

    @Override
    public boolean isEmpty() {
        //check if list is empty
        return root == null;
    }

    @Override
    public int size() {
        //return list size
        int counter = 0;
        if (root != null) {
            Node current = root;
            while (current != null) {
                current = current.next;
                counter++;
            }
        }
        return counter;
    }

    public void printll() {
        //print list
        if (root != null) {
            Node current = root;
            while (current != null) {
                System.out.println(current.data.getModuleID());
                current = current.next;
            }
        } else {
            System.out.println("LinkedList is empty");
        }
    }

}
