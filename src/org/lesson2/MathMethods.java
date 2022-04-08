package org.lesson2;

public class MathMethods {

    // методы сложения с 3 типами данных
    public static void sum(
            int firstNumber,
            int secondNumber) {
        System.out.println(
                "ответ = " + (firstNumber + secondNumber));
    }

    public static void sum(
            double firstNumber,
            double secondNumber) {
        System.out.println(
                "ответ = " + (firstNumber + secondNumber));
    }

    public static void sum(
            long firstNumber,
            long secondNumber) {
        System.out.println(
                "ответ = " + (firstNumber + secondNumber));
    }

    // методы вычитания с 3 типами данных
    public static void sub(
            int firstNumber,
            int secondNumber) {
        System.out.println(
                "ответ = " + (firstNumber-secondNumber));
    }

    public static void sub(
            double firstNumber,
            double secondNumber) {
        System.out.println(
                "ответ = " + (firstNumber-secondNumber));
    }

    public static void sub(
            long firstNumber,
            long secondNumber) {
        System.out.println(
                "ответ = " + (firstNumber-secondNumber));
    }





    // методы умножения с 3 типами данных
    public static void multi(
            int FirstNumber,
            int SecondNumber) {
        System.out.println(
                "ответ = " + (FirstNumber*SecondNumber));
    }

    public static void multi(
            double FirstNumber,
            double SecondNumber) {
        System.out.println(
                "ответ = " + (FirstNumber*SecondNumber));
    }

    public static void multi(
            long FirstNumber,
            long SecondNumber) {
        System.out.println(
                "ответ = " + (FirstNumber*SecondNumber));
    }

    // методы деления с 3 типами данных
    public static void div(
            int FirstNumber,
            int SecondNumber) {
        System.out.println(
                "ответ = " + (double) FirstNumber / (double) SecondNumber);
    }

    public static void div(
            double FirstNumber,
            double SecondNumber) {
        System.out.println(
                "ответ = " + (FirstNumber / SecondNumber));
    }

    public static void div(
            long FirstNumber,
            long SecondNumber) {
        System.out.println(
                "ответ = " + ((double) FirstNumber / (double) SecondNumber));
    }
}
