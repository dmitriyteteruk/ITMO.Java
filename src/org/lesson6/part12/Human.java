package org.lesson6.part12;

import java.util.Scanner;

// абстрактный класс Человек
abstract class Human{

    // поля: имя, фамилия;
    String firstName;
    String lastName;

    // метод получения имени
    void get_firstName(){
        System.out.println(firstName);
    }

    // метод получения фамилии
    void get_lastName(){
        System.out.println(lastName);
    }

    // абстрактный метод для вывода всей информации;
    abstract void showAllInfo();

    // конструктор для установки значений
    Human(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите имя: ");
        firstName = scanner.nextLine();
        System.out.println("Введите фамилию: ");
        lastName = scanner.nextLine();
    }
}



