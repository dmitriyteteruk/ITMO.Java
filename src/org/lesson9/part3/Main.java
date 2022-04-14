package org.lesson9.part3;

import java.util.ArrayList;
import java.util.LinkedList;

public class Main {


    public static void main(String[] args) {
        long start1 = System.currentTimeMillis();
        add1MlnToArray();
        long end1 = System.currentTimeMillis();
        System.out.println("Execution time for add1MlnToArray(): " + (end1-start1));

        long start2 = System.currentTimeMillis();
        add1MlnToLinkedList();
        long end2 = System.currentTimeMillis();
        System.out.println("Execution time for add1MlnToLinkedList(): " + (end2-start2));

        long start3 = System.currentTimeMillis();
        random100kSearchArray();
        long end3 = System.currentTimeMillis();
        System.out.println("Execution time for random100kSearchArray(): " + ((end3-start3)-(end1-start1)));

        long start4 = System.currentTimeMillis();
        random100kSearchList();
        long end4 = System.currentTimeMillis();
        System.out.println("Execution time for random100kSearchList(): " + ((end4-start4)-(end2-start2)));
    }

    private static void random100kSearchList() {
        LinkedList<Integer> linkedList1 = new LinkedList<>();
        for (int i = 0; i < 1000001; i++) {
            linkedList1.add(i);
        }

        int min = 1;
        int max = 1000000;
        int randomNum = (int)Math.floor(Math.random()*(max-min+1)+min);

        LinkedList<Integer> linkedList2 = new LinkedList<>();

        for (int i = 0; i < 100001; i++) {
            linkedList2.add(randomNum);
        }
    }

    public static void add1MlnToArray(){
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < 1000001; i++) {
            arrayList.add(i);
        }
    }

    public static void add1MlnToLinkedList(){
        LinkedList<Integer> linkedList = new LinkedList<>();
        for (int i = 0; i < 1000001; i++) {
            linkedList.add(i);
        }
    }

    public static void random100kSearchArray(){

        ArrayList<Integer> arrayList1 = new ArrayList<>();
        for (int i = 0; i < 1000001; i++) {
            arrayList1.add(i);
        }

        int min = 1;
        int max = 1000000;
        int randomNum = (int)Math.floor(Math.random()*(max-min+1)+min);

        ArrayList arrayList2 = new ArrayList<>();

        for (int i = 0; i < 100001; i++) {
                arrayList2.add(randomNum);
            }
        }


    }
