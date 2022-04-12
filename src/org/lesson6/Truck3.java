package org.lesson6;

public class Truck3 extends Car3 {
    private static int numberOfWheels = 0;
    private static int maxLoad = 10;

    public static void newWheels(int i){
        numberOfWheels = 6;
        System.out.println("Number of wheels = " + numberOfWheels);
        System.out.println("Max load = " + maxLoad);
    }

    public Truck3(int w, String m, String c, float s, int maxLoad) {
        super(w, m, c, s);
        this.maxLoad = maxLoad;
    }

    public static void main(String[] args) {
        Truck3 truck = new Truck3(1000, "CarModel", "Blue", 50, 2000);
        truck.outPut();
        Truck3.newWheels(6);
    }


}
