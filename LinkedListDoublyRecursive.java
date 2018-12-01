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
public class LinkedListDoublyRecursive implements ILinkedList {

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
        if (head == null || (head != null && head.data.getModuleID().compareToIgnoreCase(module.getModuleID()) > 0)) {
            //if list is null or id is smaller than first then add to first position
            addFirst(module);
        } else {
            addMiddleModule(module, head, head.next);
        }
    }

    private void addMiddleModule(Module module, Node current, Node after) {
        //use recursion to iterate through list until element is greater than pervious and smaller than next
        if (after != null && after.data.getModuleID().compareToIgnoreCase(module.getModuleID()) < 0) {
            addMiddleModule(module, current.next, after.next);
        } else {
            //add element to list
            Node newNode = new Node();
            newNode.data = module;
            newNode.next = current.next;
            current.next = newNode;
            newNode.previous = current;
            if (tail.data.getModuleID().compareToIgnoreCase(module.getModuleID()) < 0) {
                tail = newNode;
            } else if (newNode.next != null) {
                newNode.next.previous = newNode;
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
        if (head != null) {
            Node newNode = new Node();
            newNode.data = module;
            tail.next = newNode;
            newNode.previous = tail;
            tail = newNode;
        } else if (head == null) {
            addFirst(module);
        }
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
//        return getModuleFromHead(moduleID, head, null);
        return getModuleFromTail(moduleID, tail, null);
    }

    private Module getModuleFromHead(String moduleID, Node current, Module findModule) {
        //iterate through list from the head to find and return selected module
        if (head != null) {
            if (current.data.getModuleID().equals(moduleID)) {
                return findModule = current.data;
            } else {
                findModule = getModuleFromHead(moduleID, current.next, findModule);
            }
        }
        return findModule;
    }

    private Module getModuleFromTail(String moduleID, Node current, Module findModule) {
        //iterate through list from the tail to find and return selected module
        if (tail != null) {
            if (current.data.getModuleID().equals(moduleID)) {
                return findModule = current.data;
            } else {
                findModule = getModuleFromTail(moduleID, current.previous, findModule);
            }
        }
        return findModule;
    }

    @Override
    public Module getFirstModule() {
        //return first element
        return head.data;
    }

    @Override
    public Module getLastModule() {
        //return last element
        return tail.data;
    }

    @Override
    public Module remove(String moduleID) {
        //remove selected module
        return deleteModule(moduleID, head, head.next, null);
    }

    private Module deleteModule(String moduleID, Node current, Node after, Module delModule) {
        //delete and return element
        if (head == tail || head.next == null) {
            delModule = head.data;
            clear();
        } else if (head.data.getModuleID().equals(moduleID) && head.next != null) {
            //if element is head
            delModule = removeFirstModule();
        } else if (tail.data.getModuleID().equals(moduleID) && tail.previous != null) {
            //if element is tail
            delModule = removeLastModule();
        } else if (after.data.getModuleID().equals(moduleID) && head.next != null) {
            //if next element is selected element then delete element
            delModule = after.data;
            if (after.next != null) {
                current.next = after.next;
                after.next.previous = current;
            } else if (after.next == null) {
                removeLastModule();
            }
        } else if (!after.data.getModuleID().equals(moduleID) && head.next != null) {
            //iterate through list to find selected element
            delModule = deleteModule(moduleID, current.next, after.next, delModule);
        }
        return delModule;
    }

    @Override
    public Module removeFirstModule() {
        //delete first element
        Module delModule = null;
        if (head != null) {
            delModule = head.data;
            head.next.previous = null;
            head = head.next;
        }
        return delModule;
    }

    @Override
    public Module removeLastModule() {
        //delete last element
        Node last = tail;
        if (tail != null) {
            Node penultimate = tail.previous;
            tail = penultimate;
            penultimate.next = null;
        }
        return last.data;
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

    @Override
    public boolean isEmpty() {
        //check if list is empty
        return head == null;
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
