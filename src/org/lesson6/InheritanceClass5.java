package org.lesson6;

public class InheritanceClass5 extends MainClass5{
    private String userName;

    @Override
    public void setUserAge(){
        System.out.println("Enter User Name :");
        userName = scanner.nextLine();
    }

    public String getUserName() {
        return userName;
    }
}
