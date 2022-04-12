package org.lesson6;

public class Client extends Human {
    private String bankName;


    @Override
    public String getAllInfo() {
        String s = getFirstName() + getLastName() + bankName;
        return s;
    }

    public Client(String bankName, String firstName, String lastName){
        super(firstName, lastName);
        this.bankName = bankName;
    }

    public void setInfo (String bankName){
        this.bankName = bankName;
        this.setInfo(getFirstName(), getFirstName());
    }

    @Override
    public String getBankName(){
        return null;
    }
}
