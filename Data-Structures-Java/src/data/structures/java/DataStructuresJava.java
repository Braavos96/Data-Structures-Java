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
public class DataStructuresJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        LinkedList ll = new LinkedList();
//        LinkedListRecursive ll = new LinkedListRecursive();
//        LinkedListReverse ll = new LinkedListReverse();
//        LinkedListReverseRecursive ll = new LinkedListReverseRecursive();
//        LinkedListDoubly ll = new LinkedListDoubly();
//        LinkedListDoublyRecursive ll = new LinkedListDoublyRecursive();
        BinarySearchTree ll = new BinarySearchTree();
//        AVLTree ll = new AVLTree();
        Module m1a = new Module("01", "A");
        Module m2a = new Module("02", "B");
        Module m3a = new Module("03", "C");
        Module m4a = new Module("04", "D");
        Module m5a = new Module("05", "E");
        Module m6a = new Module("06", "F");
        Module m7a = new Module("07", "G");
        Module m8a = new Module("08", "H");
        Module m9a = new Module("09", "I");
        Module m10a = new Module("00", "J");
        Module m11a = new Module("10", "K");
        Module m12a = new Module("11", "L");
        Module m13a = new Module("12", "M");
        Module m14a = new Module("13", "N");
        Module m15a = new Module("14", "O");

        System.out.println("isEmpty " + ll.isEmpty());
        System.out.println("size " + ll.size());
        System.out.println("add stuff ");

        ll.add(m3a);
        System.out.println("");
        ll.printll();
//        ll.getDepth();
//        System.out.println("last " + ll.getLastModule().getModuleID());

        ll.add(m4a);
        System.out.println("");
        ll.printll();
//        ll.getDepth();
//        System.out.println("last " + ll.getLastModule().getModuleID());

        ll.add(m1a);
        System.out.println("");
        ll.printll();
//        ll.getDepth();
//        System.out.println("last " + ll.getLastModule().getModuleID());

        ll.add(m2a);
        System.out.println("");
        ll.printll();
//        ll.getDepth();
//
////        System.out.println("last " + ll.getLastModule().getModuleID());
        ll.add(m7a);
        System.out.println("");
        ll.printll();
//        ll.getDepth();
        ll.add(m8a);
        System.out.println("");
        ll.printll();
//        ll.getDepth();
        ll.add(m6a);
        System.out.println("");
        ll.printll();
//        ll.getDepth();
        ll.add(m5a);
        System.out.println("");
        ll.printll();
//        ll.getDepth();
        ll.add(m10a);
        System.out.println("");
        ll.printll();
//        ll.getDepth();
        ll.add(m9a);
        System.out.println("");
        ll.printll();
//        ll.getDepth();
        ll.add(m10a);
        System.out.println("");
        ll.printll();
//        ll.getDepth();
        ll.add(m11a);
        System.out.println("");
        ll.printll();
//        ll.getDepth();
        ll.add(m12a);
        System.out.println("");
        ll.printll();
//        ll.getDepth();
        ll.add(m13a);
        System.out.println("");
        ll.printll();
//        ll.getDepth();
        ll.add(m14a);
        System.out.println("");
        ll.printll();
//        ll.getDepth();
        ll.add(m15a);
        System.out.println("");
        ll.printll();
//        ll.getDepth();
//
//
//        System.out.println("contains 01 " + ll.contains("01"));
//        System.out.println("contains 02 " + ll.contains("02"));
//        System.out.println("contains 03 " + ll.contains("03"));
//        System.out.println("contains 04 " + ll.contains("04"));
//        System.out.println("");
//        System.out.println("getmodule 01 " + ll.getModule("01").getModuleID());
//        System.out.println("getmodule 02 " + ll.getModule("02").getModuleID());
//        System.out.println("getmodule 03 " + ll.getModule("03").getModuleID());
//        System.out.println("getmodule 04 " + ll.getModule("04").getModuleID());
//        System.out.println("getmodule first " + ll.getFirstModule().getModuleID());
//        System.out.println("getmodule last " + ll.getLastModule().getModuleID());
        System.out.println("");
        ll.printll();
        System.out.println("\nisEmpty " + ll.isEmpty());
        System.out.println("size " + ll.size());
//        System.out.println("get " + ll.getModule("04").getModuleID());
//        System.out.println("get " + ll.getModule("07").getModuleID());
//        System.out.println("contains " + ll.contains("03"));
        System.out.println("first 0 " + ll.remove("00").getModuleID());
        System.out.println("mid 2 " + ll.remove("07").getModuleID());
        System.out.println("mid 3 " + ll.remove("14").getModuleID());
        System.out.println("last 9 " + ll.remove("05").getModuleID());
//        System.out.println("first " + ll.getFirstModule().getModuleID());
//        System.out.println("last " + ll.getLastModule().getModuleID());
//
//        System.out.println("first " + ll.removeFirstModule().getModuleID());
//        System.out.println("last " + ll.removeLastModule().getModuleID());
//
        System.out.println("");
//        ll.clear();
        ll.printll();
        System.out.println("\nisEmpty " + ll.isEmpty());
        System.out.println("size " + ll.size());
    }
    
}
