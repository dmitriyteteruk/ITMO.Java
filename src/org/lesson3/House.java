// 3. Создайте класс Дом. Добавьте в него следующие данные:
//●	поля: количество этажей, год постройки, наименование;
//●	метод для установки всех значений;
//●	метод для вывода всех значений;
//●	метод, возвращающий количество лет с момента постройки.
//
//На основе класса создайте два объекта и пропишите для каждого характеристики.
// Добавление характеристик реализуйте через метод класса.
//
//Выведите информацию про каждый объект.

package org.lesson3;

import java.util.Scanner;

public class House {
    // переменные класса
    private int numberOfFloors;
    protected int buildDate;
    private String houseName;

    // метод ввода данные
    public void setAllParameters(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите кол-во этажей");
        numberOfFloors = scanner.nextInt();

        System.out.println("Введите год постройки");
        buildDate = scanner.nextInt();

        System.out.println("Введите название дома");
        houseName = scanner.next();

        System.out.println("Спасибо! \n");
    }

    // метод вывода всех значений

    public void showAllParameters(){
        System.out.println("Вы ввели следующую информацию: \n");
        System.out.println("Количество этажей в доме " + numberOfFloors);
        System.out.println("Год посотройки дома " + buildDate);
        System.out.println("Название дома " + houseName);
    }

    // метод расчета возвраста постройки дома
    public int ageOfHouse(int a, int b){
        int result = b - a;
        return result;
    }
}