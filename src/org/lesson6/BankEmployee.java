package org.lesson6;

public abstract class BankEmployee extends Human {

    String bankName;
    public BankEmployee(String firstName, String lastName, String bankName) {
        super(firstName, lastName);
        this.bankName = bankName;
    }

    @Override
    public String getAllInfo() {
        String s = getFirstName() + getLastName() + bankName;
        return s;
    }


    public void setInfo (String bankName){
        this.bankName = bankName;
        this.setInfo(getFirstName(), getFirstName());
}}
