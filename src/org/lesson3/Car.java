// 2. Создайте простой класс, который будет иметь поля: цвет, название, вес. Создайте метод
//в классе через который можно будет вывести все эти данные. Добавьте два объекта,
// установите для них значения и выведите все при помощи ранее созданного метода.
// Также добавьте несколько конструкторов, которые будут устанавливать:
//●	только цвет машины;
//●	цвет и вес машины;
//●	и пустой конструктор.

package org.lesson3;

public class Car {
    // переменные класса
    private String color;
    private String brand;
    private int weight;

    public Car (String c, String b, int w){
        color = c;
        brand = b;
        weight = w;
    }
    // конструкторы
    public String result (String c){
        String part = "Цвет :" + c + ".";
        return part;
    }

    public String result (String c, int w){
        String part = "Цвет: " + c + ", вес " + w + ".";
        return part;
    }

    public void result (){
        System.out.println("Пустой конструктор");
    }

    // метод выводит все данные о машине
    public String showAll(){
        String full = "Цвет: " + color + ", марка " + brand + ", вес " + weight;
        return full;
    }
}