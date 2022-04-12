package org.lesson6;

public class Car3 {
    public int weight;
    public String model;
    public String color;
    public float speed;


    public void outPut () {
        System.out.println("Вес " + model + " составляет " + weight + "кг.");
        System.out.println("Цвет машины - " + color + " и её скорость - " + speed);
    }

    public Car3(int w, String m, String c, float s) {
        weight = w;
        model = m;
        color = c;
        speed = s;
    }

    public Car3() {}
}
