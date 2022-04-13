// вложенные классы
package org.lesson7;

import java.util.Scanner;

class Plane {
    Wing wing1 = new Wing();
    Wing wing2 = new Wing();

    void setWings(){
        wing1.setWingWeight();
        wing2.setWingWeight();
    }

    void getWings(){
        wing1.getWingWeight();
        wing2.getWingWeight();

    }

// внутренний класс
    class Wing{
        int wingWeight;
        Scanner scanner = new Scanner(System.in);

        void setWingWeight(){
            System.out.println("Введите вес крыла: ");
            wingWeight = scanner.nextInt();
        }

        void getWingWeight(){
            System.out.println("Вес крыла равен: " + wingWeight);
        }
}

    public static void main(String[] args) {
        Plane plane = new Plane();
        plane.setWings();
        plane.getWings();

    }
}

