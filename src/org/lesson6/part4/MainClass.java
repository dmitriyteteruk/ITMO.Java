package org.lesson6.part4;

import java.util.Scanner;

public class MainClass {
    public static int intForInteger;

    public int getInt(){
        Scanner scanner = new Scanner(System.in);
        intForInteger = scanner.nextInt();
        return intForInteger;
    }
}
