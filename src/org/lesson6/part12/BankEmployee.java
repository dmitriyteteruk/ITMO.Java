package org.lesson6.part12;

import java.util.Scanner;

class BankEmployee {
    // строковое поле Название банка
    String bankName;

    // конструктор для установки всех значений
    BankEmployee(){
        Scanner scanner = new Scanner(System.in);
        bankName = scanner.nextLine();
    }

//    @Override
//    void showAllInfo() {
//        System.out.println("Вся информация: ");
//        System.out.println(firstName + " " + lastName + " " + bankName);
//    }

}


