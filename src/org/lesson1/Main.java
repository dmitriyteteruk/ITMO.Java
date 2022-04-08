package org.lesson1;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World!");

        // задание 1
        String string1 = "Я";
        String string2 = "хорошо";
        String string3 = "знаю";
        String string4 = "Java";
        String string5 = "ничего";

        System.out.println(string1);
        System.out.println(string2);
        System.out.println(string3);
        System.out.println(string4);
        System.out.println(string5);

        // задание 2
        double a = 46;
        double b = 10;
        double c = 10;
        double d = 3;
        double firstResult = (a+b)*(c/d);
        System.out.println(firstResult);

        int e = 29;
        int f = 4;
        int g = -15;

        int secondResult = e * f * g;
        System.out.println(secondResult);

        // задание 3

        int longNumber = 10500;
        int thirdResult = (longNumber/10)/10;
        System.out.println(thirdResult);

        // задание 4
        double h = 3.6;
        double i = 4.1;
        double j = 5.9;
        double fourthResult = h * i * j;
        System.out.println(fourthResult);

    }
}
