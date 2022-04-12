package org.lesson6;

public class InheritanceClass4 extends MainClass4 {

    public static void setIntegerInMain(){
        System.out.println("Integer from Main Class = " + intForInteger);
    }

    public static void main(String[] args) {
        InheritanceClass4 i = new InheritanceClass4();
        setIntegerInMain();
    }
}
