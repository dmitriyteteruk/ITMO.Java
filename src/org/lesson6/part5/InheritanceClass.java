package org.lesson6.part5;

public class InheritanceClass extends MainClass {
    private String userName;

    @Override
    public void setUserAge(){
        System.out.println("Enter User Name: ");
        userName = scanner.nextLine();
        System.out.println("Enter User Age: ");
        this.userAge = scanner.nextInt();
    }

    void showInfo(){
        System.out.println("User Name " + userName);
        System.out.println("User Age " + userAge);
    }

    public static void main(String[] args) {
        InheritanceClass classOb = new InheritanceClass();
        classOb.setUserAge();
        classOb.showInfo();
    }
}
