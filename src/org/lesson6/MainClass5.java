package org.lesson6;

import java.util.Scanner;

public class MainClass5 {
    private int userAge;
    public Scanner scanner = new Scanner(System.in);

    public void setUserAge(){
        System.out.println("Enter userAge: " + scanner);
        userAge = scanner.nextInt();
    }

    public int getUserAge(){
        return userAge;
    }
}

