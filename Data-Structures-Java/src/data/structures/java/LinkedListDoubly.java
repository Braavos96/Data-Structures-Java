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
public class LinkedListDoubly implements ILinkedList {

    class Node {

        Node previous;
        Module data;
        Node next;
    }
    Node head;
    Node tail;

    @Override
    public void add(Module module) {
        //add element to list
        Node newNode = new Node();
        newNode.data = module;
        if (head == null) {
            newNode.next = head;
            head = tail = newNode;
        } else if (head != null) {
            if (head.data.getModuleID().compareToIgnoreCase(module.getModuleID()) > 0) {
                //if list is null or id is smaller than first then add to first position
                addFirst(module);
            } else {
                Node current = head;
                Node after = current.next;
                while (after != null && after.data.getModuleID().compareToIgnoreCase(module.getModuleID()) < 0) {
                    //iterate through list until element is greater than pervious and smaller than next
                    current = after;
                    after = after.next;
                }
                newNode.next = current.next;
                newNode.previous = current;
                current.next = newNode;
                if (after == null) {
                    tail = newNode;
                } else if (after != null) {
                    after.previous = newNode;
                }
            }
        }
    }

    @Override
    public void addFirst(Module module) {
        //add module to the start of the list
        Node newNode = new Node();
        newNode.data = module;
        if (head != null) {
            newNode.next = head;
            head.previous = newNode;
            head = newNode;
        } else if (head == null) {
            newNode.next = head;
            head = tail = newNode;
        }
    }

    @Override
    public void addLast(Module module) {
        //add module to the end of the list
        Node newNode = new Node();
        newNode.data = module;
        tail.next = newNode;
        newNode.previous = tail;
        tail = newNode;
    }

    @Override
    public void clear() {
        //clear the list
        head = tail = null;
    }

    @Override
    public boolean contains(String moduleID) {
        //check if id exists in list
        return getModule(moduleID) != null;
    }

    @Override
    public Module getModule(String moduleID) {
//        return getModuleFromHead(moduleID);
        return getModuleFromTail(moduleID);
    }

    private Module getModuleFromHead(String moduleID) {
        //iterate through list from the head to find and return selected module
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

    private Module getModuleFromTail(String moduleID) {
        //iterate through list from the tail to find and return selected module
        Module getModule = null;
        Node current = tail;
        while (current != null && getModule == null) {
            if (current.data.getModuleID().equals(moduleID)) {
                getModule = current.data;
            }
            current = current.previous;
        }
        return getModule;
    }

    @Override
    public Module getFirstModule() {
        //return first node
        return head.data;
    }

    @Override
    public Module getLastModule() {
        //return last node
        return tail.data;
    }

    @Override
    public Module remove(String moduleID) {
        //delete and return element
        Module delNode = null;
        if (head == tail || head.next == null) {
            //if one element in list
            delNode = head.data;
            clear();
        } else if (head.data.getModuleID().equals(moduleID) && head.next != null) {
            //if element is head
            delNode = removeFirstModule();
        } else if (tail.data.getModuleID().equals(moduleID) && tail.previous != null) {
            //if element is tail
            delNode = removeLastModule();
        } else {
            if (head != null && head.next != null) {
                Node current = head;
                Node after = current.next;
                //iterate through list to find selected element
                while (current != null && delNode == null) {
                    //check if next node id is equal to selected id
                    if (after.data.getModuleID().equals(moduleID)) {
                        delNode = after.data;
                        if (after.next != null) {
                            current.next = after.next;
                            after.next.previous = current;
                        } else if (after.next == null) {
                            current.next = null;
                            tail = current;
                        }
                    }
                    current = after;
                    after = after.next;
                }
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
            head.next.previous = null;
            head = head.next;
        }
        return delNode;
    }

    @Override
    public Module removeLastModule() {
        //delete last element
        Module delNode = null;
        if (head != null) {
            delNode = tail.data;
            Node current = tail.previous;
            current.next = null;
            tail = current;
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
        printlhead();
        System.out.println("");
        printltail();
    }

    public void printltail() {
        //print list tail to head
        Node current = tail;
        while (current != null) {
            System.out.println("tail to head " + current.data.getModuleID());
            current = current.previous;
        }
    }

    public void printlhead() {
        //print list head to tail
        Node current = head;
        while (current != null) {
            System.out.println("head to tail " + current.data.getModuleID());
            current = current.next;
        }
    }

}
