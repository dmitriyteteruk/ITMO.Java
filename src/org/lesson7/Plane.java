package org.lesson7;

public class Plane {

    public static class Wing {
        private int wingWeight;

        public void setWingWeight(int wingWeight) {
            this.wingWeight = wingWeight;
        }

        public void printWingWeight() {
            System.out.println(wingWeight);
        }
    }

    public static void main(String[] args) {
        Plane.Wing wing1 = new Plane.Wing();
        wing1.setWingWeight(20);
        wing1.printWingWeight();
        Plane.Wing wing2 = new Plane.Wing();
        wing2.setWingWeight(30);
        wing2.printWingWeight();
    }
}
