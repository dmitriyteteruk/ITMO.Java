package org.lesson6.part3;

public class Truck extends Car {
    private static int numberOfWheels;
    private static int maxLoad;

    public static void newWheels(int i){
        numberOfWheels = 6;
        System.out.println("Number of wheels = " + numberOfWheels);
        System.out.println("Max load = " + maxLoad);
    }

    public Truck(int w, String m, String c, float s, int maxLoad) {
        super(w, m, c, s);
        this.maxLoad = maxLoad;
    }

    public void main(String[] args) {
        Truck truck = new Truck(1000, "CarModel", "Blue", 50, 2000);
        truck.outPut();
        Truck.newWheels(6);
    }


}
