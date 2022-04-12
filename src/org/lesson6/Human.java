package org.lesson6;

public abstract class Human {
    private String firstName;
    private String lastName;


    public Human(String firstName, String lastName) {
    }

    // метод получения имени
    public String getFirstName() { return firstName; }

    // метод получения фамилии
    public String getLastName() { return lastName; }


    // метод установки значений
    public void setInfo (String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public abstract String getAllInfo();

    public abstract String getBankName();
}


