package org.lesson9.part3;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

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
        System.out.println("Execution time for random100kSearchArray(): " + (end3-start3));

        long start4 = System.currentTimeMillis();
        random100kSearchList();
        long end4 = System.currentTimeMillis();
        System.out.println("Execution time for random100kSearchList(): " + (end4-start4));
    }

    public static List<Integer> add1MlnToArray(){
        List<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < 1000001; i++) {
            arrayList.add(i);
        }
        return arrayList;
    }

    public static List<Integer> add1MlnToLinkedList(){
        List<Integer> linkedList = new LinkedList<>();
        for (int i = 0; i < 1000001; i++) {
            linkedList.add(i);
        }
        return linkedList;
    }

    public static void random100kSearchArray(){

        List<Integer> integerList = add1MlnToArray();

        int min = 1;
        int max = 1000000;
        int randomNum = (int)Math.floor(Math.random()*(max-min+1)+min);

        for (int i = 0; i < 100000; i++) {
                integerList.get(randomNum);
            }
        }

    private static void random100kSearchList() {
        List<Integer> linkedList = add1MlnToLinkedList();


        int min = 1;
        int max = 1000000;
        int randomNum = (int)Math.floor(Math.random()*(max-min+1)+min);

        for (int i = 0; i < 100001; i++) {
            linkedList.get(randomNum);
        }
    }


    }
