/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datastructures;

/**
 *
 * @author Braavos
 */
public class LinkedListReverse implements ILinkedList {

    class Node {

        Module data;
        Node next;
    }

    private Node head;

    @Override
    public void add(Module module) {
        Node newNode = new Node();
        newNode.data = module;
        if (head == null || head.data.getModuleID().compareToIgnoreCase(module.getModuleID()) < 0) {
            //if list is null or id is smaller than pervious add to first position
            newNode.next = head;
            head = newNode;
        } else if (head != null) {
            Node current = head;
            Node after = current.next;
            while (after != null && after.data.getModuleID().compareToIgnoreCase(module.getModuleID()) > 0) {
                //iterate through list until element is less than next and greater than previous
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
        newNode.next = head;
        head = newNode;
    }

    @Override
    public void addLast(Module module) {
        //add module to the end of the list
        Node newNode = new Node();
        newNode.data = module;
        Node lastNode = getPenultimateNode().next;
        lastNode.next = newNode;
    }

    private Node getPenultimateNode() {
        //iterate through and return penunltimate node
        if (head != null) {
            Node current = head;
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
    public void clear() {
        //clear the list
        head = null;
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
        Node current = head;
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
        return head.data;
    }

    @Override
    public Module getLastModule() {
        //return last module
        return getPenultimateNode().next.data;
    }

    @Override
    public Module remove(String moduleID) {
        //remove selected module
        Module delNode = null;
        if (head.data.getModuleID().equals(moduleID) && head.next != null) {
            delNode = removeFirstModule();
        } else {
            delNode = removeMiddleModule(moduleID);
        }
        return delNode;
    }

    private Module removeMiddleModule(String moduleID) {
        //iterate through and delete and return deleted module
        Module delNode = null;
        if (head.next == null) {
            //if list is has one or no nodes
            delNode = head.data;
            head = null;
        } else {
            Node current = head;
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
        if (head != null) {
            delNode = head.data;
            head = head.next;
        }
        return delNode;
    }

    @Override
    public Module removeLastModule() {
        //delete last element
        Module delNode = null;
        if (head != null) {
            Node current = getPenultimateNode();
            delNode = current.next.data;
            current.next = null;
        }
        return delNode;
    }

    @Override
    public boolean isEmpty() {
        //check if list is empty
        return head == null;
    }

    @Override
    public int size() {
        //return list size
        return count(head);
    }

    private int count(Node current) {
        //iterate through the list and find list size
        if (current == null) {
            return 0;
        } else {
            return 1 + count(current.next);
        }
    }

    public void printll() {
        //print list
        Node current = head;
        while (current != null) {
            System.out.println(current.data.getModuleID());
            current = current.next;
        }
    }

}
