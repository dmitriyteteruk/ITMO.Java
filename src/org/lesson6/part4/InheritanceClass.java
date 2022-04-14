package org.lesson6.part4;

public class InheritanceClass extends MainClass {

    public void setIntegerInMain(){

        System.out.println("Integer from Main Class = " + super.getInt());
    }

    public static void main(String[] args) {
        InheritanceClass i = new InheritanceClass();
        i.setIntegerInMain();


    }
}
