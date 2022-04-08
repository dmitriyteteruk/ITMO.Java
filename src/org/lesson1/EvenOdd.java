package org.lesson1;

import java.util.Scanner;

public class EvenOdd {

    // 6
    public static void main(String[] args) {
        System.out.println("¬ведите число: ");
        Scanner scan = new Scanner(System.in);

        int evenOdd = scan.nextInt();

        if (evenOdd % 2 == 0) {
            System.out.println(evenOdd + " четное.");
        } else {
            System.out.println(evenOdd + " не четное.");
        }
    }
}
