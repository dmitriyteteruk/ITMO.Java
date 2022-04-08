// 2) Создать класс, который обозначает какую-либо сущность.
// Определить у него несколько конструкторов - конструктор по умолчанию
// и конструктор со всеми параметрами. Определить для него несколько параметров.
package org.lesson2;

public class DemoBox{
    public static void main(String args[]){
        Box newbox1 = new Box(5, 5, 5, "White");
        Box newbox2 = new Box(10, 10, 10, "Blue");

        double vol;
        double length;

        vol = newbox1.volume();
        length = newbox1.lengthOfSides();
        System.out.println("Объем первого параллелипипда равен: " + vol +
                ", длина сторон равна " + length + ", а цвет " + newbox1.color());

        vol = newbox2.volume();
        length = newbox2.lengthOfSides();
        System.out.println("Объем второго параллелипипда равен: " + vol +
                ", длина сторон равна " + length + ", а цвет " + newbox2.color());
    }
}