package org.lesson6.part12;

import java.util.Scanner;

// наследование класса Человек добавлено
class Client extends Human {
    // строковое поле Название банка
    String bankName;

    // конструктор для установки всех значений
    Client(String firstName, String lastName, String bankName){
        super(firstName, lastName);
        this.bankName = bankName;
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Введите название банка: ");
//        bankName = scanner.nextLine();
    }

    @Override
    void showAllInfo() {
        System.out.println("Вся информация: ");
        System.out.println(firstName + " " + lastName + " " + bankName);

    }

}

