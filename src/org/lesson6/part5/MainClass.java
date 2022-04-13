package org.lesson6.part5;

import java.util.Scanner;

public class MainClass {
    public int userAge;
    public Scanner scanner = new Scanner(System.in);

    public void setUserAge(){
        System.out.println("Enter userAge: " + scanner);
        userAge = scanner.nextInt();
    }

    public int getUserAge(){
        return userAge;
    }
}

