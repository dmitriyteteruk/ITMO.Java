package org.lesson6.part3;

public class Car {
    public int weight;
    public String model;
    public String color;
    public float speed;


    public void outPut () {
        System.out.println("��� " + model + " ���������� " + weight + "��.");
        System.out.println("���� ������ - " + color + " � � �������� - " + speed);
    }

    public Car(int w, String m, String c, float s) {
        weight = w;
        model = m;
        color = c;
        speed = s;
    }

    public Car() {}
}
