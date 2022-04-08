package org.lesson2;


public class Box {
    private double width;
    private double height;
    private double depth;
    private String color;


    public Box (double w, double h, double d, String c){
        width = w;
        height = h;
        depth = d;
        color = c;
    }

    public double volume(){
        return width * height * depth;
    }

    public double lengthOfSides(){
        return height*4 + width*4 + depth*4;
    }

    public String color(){
        return color;
    }
}