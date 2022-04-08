package org.lesson3;

class CarDemo {
    public static void main(String arg[]){
        Car car1 = new Car("White", "Lada", 1750);
        Car car2 = new Car("Black", "Niva", 2100);

        String showAll = car1.showAll();
        System.out.println(showAll);

        String showPart = car1.result("yellow", 1000);
        System.out.println(showPart);
    }
}
