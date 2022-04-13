package org.lesson6.part4;

public class InheritanceClass extends MainClass {

    public static void setIntegerInMain(){
        System.out.println("Integer from Main Class = " + intForInteger);
    }

    public static void main(String[] args) {
        InheritanceClass i = new InheritanceClass();
        setIntegerInMain();
    }
}
