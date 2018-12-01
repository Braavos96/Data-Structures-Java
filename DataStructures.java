/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datastructures;

/**
 * @author Braavos
 */
public class DataStructures {

    public static void main(String[] args) {
//        Module m1a = new Module("01", "A");
//        Module m2a = new Module("02", "B");
//        Module m3a = new Module("03", "C");
//        Module m4a = new Module("04", "D");
//        Module m5a = new Module("05", "E");
//        Module m6a = new Module("06", "F");
//        Module m7a = new Module("07", "G");
//        Module m8a = new Module("08", "H");
//        Module m9a = new Module("09", "I");
//        Module m10a = new Module("00", "J");
//        Module m1 = new Module("10", "MCT");
//        Module m2 = new Module("11", "BC");
//        Module m3 = new Module("12", "SDE");
//        Module m4 = new Module("13", "IOOP");
//        Module m5 = new Module("14", "NAM");
//        Module m6 = new Module("15", "DM");
//        Module m7 = new Module("16", "FOC");
//        Module m8 = new Module("17", "FOOP");
//        Module m9 = new Module("18", "SDCC++");
//        Module m10 = new Module("19", "PICR");
//        Module m11 = new Module("20", "CR");
//        Module m12 = new Module("21", "RSSD");
//        Module m13 = new Module("22", "DS");
//        Module m14 = new Module("23", "FOS");
//        Module m15 = new Module("24", "AOO");
//        Module m16 = new Module("25", "AA");
//        Module m17 = new Module("26", "AB");
//        Module m18 = new Module("27", "AC");
//        Module m19 = new Module("28", "AD");
//        Module m20 = new Module("29", "AF");
//        Module m21 = new Module("30", "AG");
//        Module m22 = new Module("31", "AH");
//        Module m23 = new Module("32", "AI");
//        Module m24 = new Module("33", "AJ");
//        Module m25 = new Module("34", "AK");
//        Module m26 = new Module("35", "AL");
//        Module m27 = new Module("36", "AM");
//        Module m28 = new Module("37", "AN");
//        Module m29 = new Module("38", "AO");
//        Module m30 = new Module("39", "AP");
//        Module m31 = new Module("40", "AQ");
//        Module m32 = new Module("41", "AR");
//        Module m33 = new Module("42", "AS");
//        Module m34 = new Module("43", "AT");
//        Module m35 = new Module("44", "AU");
//        Module m36 = new Module("45", "AV");
//        Module m37 = new Module("46", "AW");
//        Module m38 = new Module("47", "AX");
//        Module m39 = new Module("48", "AY");
//        Module m40 = new Module("49", "AZ");
//        Module m41 = new Module("50", "BA");
//        Module m42 = new Module("51", "BC");
//        Module m43 = new Module("52", "BD");
//        Module m44 = new Module("53", "BE");
//        Module m45 = new Module("54", "BF");
//        Module m46 = new Module("55", "BG");
//        Module m47 = new Module("56", "BH");
//        Module m48 = new Module("57", "BI");
//        Module m49 = new Module("58", "BJ");
//        Module m50 = new Module("59", "BK");

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

//        ll.add(m1a);
//        ll.add(m2a);
//        ll.add(m3a);
//        ll.add(m4a);
//        System.out.println("add 3 " + m3a.getModuleID());
//        ll.add(m3a);
//        System.out.println("add 4 " + m4a.getModuleID());
//        ll.add(m4a);
//        System.out.println("add 1 " + m1a.getModuleID());
//        ll.add(m1a);
//        System.out.println("add 2 " + m2a.getModuleID());
//        ll.add(m2a);

//        ll.addLast(m10a);
//        ll.addFirst(m9a);
//
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
