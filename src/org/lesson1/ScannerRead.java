package org.lesson1;

import java.util.Scanner;

public class ScannerRead {

    // задание 5

    public static void main (String[] args){
        System.out.println("Введите число СОРОК ДВА: ");
        Scanner scan42 = new Scanner(System.in);
        int scan42int = scan42.nextInt();

        System.out.println("Введите число СТО: ");
        Scanner scan100 = new Scanner(System.in);
        int scan100int = scan100.nextInt();

        System.out.println("Введите число СТО ДВАДЦАТЬ ПЯТЬ: ");
        Scanner scan125 = new Scanner(System.in);
        int scan125int = scan125.nextInt();

        System.out.println("Вы ввели числа: \n" + scan42int + "\n" + scan100int + "\n" + scan125int);
    }
}