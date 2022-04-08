package org.lesson2;

import java.util.Scanner;

// Создаем класс Калькулятор.

class Calculator2 {
    public static void main(String[] args) {

        double firstNumber = 0;
        double secondNumber = 0;

        int init1 = 0;
        int init2 = 0;

        long init3 = 0L;
        long init4 = 0L;

        System.out.println("Введите первое число");
        Scanner scannerFirstNumber = new Scanner(System.in);

        // проверяем тип 1 числа на входе и присваиваем нужный тип
        if (scannerFirstNumber.hasNextInt()) {
            firstNumber = scannerFirstNumber.nextInt();
            init1 = (int) firstNumber;
        } else if (scannerFirstNumber.hasNextLong()) {
            firstNumber = scannerFirstNumber.nextLong();
            init3 = (long) firstNumber;
        } else if (scannerFirstNumber.hasNextDouble()) {
            firstNumber = scannerFirstNumber.nextDouble();
        }

        // проверяем тип 2 числа на входе и присваиваем нужный тип
        System.out.println("Введите второе число");
        Scanner scannerSecondNumber = new Scanner(System.in);
        if (scannerSecondNumber.hasNextInt()) {
            secondNumber = scannerSecondNumber.nextInt();
            init2 = (int) secondNumber;
        } else if (scannerSecondNumber.hasNextLong()) {
            secondNumber = scannerSecondNumber.nextLong();
            init4 = (long) secondNumber;
        } else if (scannerSecondNumber.hasNextDouble()) {
            secondNumber = scannerSecondNumber.nextDouble();
        }

        // Создаем экземпляр класс математических методов
        MathMethods OverloadMethod = new MathMethods();


        // ЗАПРОС ДЕЙСТВИЯ
        System.out.println("Выберите номер действия");
        System.out.println("1. Сложение");
        System.out.println("2. Вычитание");
        System.out.println("3. Умножение");
        System.out.println("4. Деление");

        Scanner scannerAction = new Scanner(System.in);
        int action = scannerAction.nextInt();

        // проверяем на ошибку действие
        if (action < 0 || action > 5) {
            System.out.println("Вы ввели неверный номер действия.");
        }
        // ВЫБОР ДЕЙСТВИЯ И ВЫЗОВ НУЖНОГО МЕТОДА
        // ЛОГИКА ВЫБОРА ТИПА:
        // - если хоть 1 число double - все приводятся к double
        // - если все числа int - выбираем int
        // СЛОЖЕНИЕ = 1
        else if (action == 1) {
            if (init1 != 0 && init2 != 0) {
                OverloadMethod.sum(
                        init1,
                        init2);
            } else if ((firstNumber < Long.MAX_VALUE && firstNumber > Integer.MAX_VALUE) &&
                    (secondNumber < Long.MAX_VALUE && secondNumber > Integer.MAX_VALUE)) {
                OverloadMethod.sum(
                        init3,
                        init4);
            } else if (init1 == 0 && init2 == 0 && init3 == 0 && init4 == 0 ) {
                OverloadMethod.sum(
                        firstNumber,
                        secondNumber);
            }
        }
        // ВЫЧИТАНИЕ = 2
        else if (action == 2) {
            if (init1 != 0 && init2 != 0) {
                OverloadMethod.sub(
                        init1,
                        init2);
            } else if ((firstNumber < Long.MAX_VALUE && firstNumber > Integer.MAX_VALUE) &&
                    (secondNumber < Long.MAX_VALUE && secondNumber > Integer.MAX_VALUE)) {
                OverloadMethod.sub(
                        init3,
                        init4);
            } else if (init1 == 0 && init2 == 0 && init3 == 0 && init4 == 0 ) {
                OverloadMethod.sub(
                        firstNumber,
                        secondNumber);
            }
        }
        // УМНОЖЕНИЕ = 3
        else if (action == 3) {
            if (init1 != 0 && init2 != 0) {
                OverloadMethod.multi(
                        init1,
                        init2);
            } else if ((firstNumber < Long.MAX_VALUE && firstNumber > Integer.MAX_VALUE) &&
                    (secondNumber < Long.MAX_VALUE && secondNumber > Integer.MAX_VALUE)) {
                OverloadMethod.multi(
                        init3,
                        init4);
            } else if (init1 == 0 && init2 == 0 && init3 == 0 && init4 == 0 ) {
                OverloadMethod.multi(
                        firstNumber,
                        secondNumber);
            }
        }

        // ДЕЛЕНИЕ  = 4
        else if (action == 4) {
            if (secondNumber == 0 && (init2 == 0 || init4 == 0)){
                System.out.println("На ноль делить нельзя.");
            } else if (init1 != 0 && init2 != 0) {
                OverloadMethod.div(
                        init1,
                        init2);
            } else if ((firstNumber < Long.MAX_VALUE && firstNumber > Integer.MAX_VALUE) &&
                    (secondNumber < Long.MAX_VALUE && secondNumber > Integer.MAX_VALUE)) {
                OverloadMethod.div(
                        init3,
                        init4);
            } else if (init1 == 0 && init2 == 0 && init3 == 0 && init4 == 0 ) {
                OverloadMethod.div(
                        firstNumber,
                        secondNumber);
            }
        }
    }
}

