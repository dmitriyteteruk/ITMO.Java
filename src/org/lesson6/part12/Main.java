package org.lesson6.part12;

public class Main {
    public static void main(String[] args) {
       Client client = new Client();
        client.showAllInfo();
        System.out.println();
        client.get_firstName();
        client.get_lastName();

        BankEmployee bankEmployee = new BankEmployee();
        bankEmployee.showAllInfo();
        System.out.println();
        bankEmployee.get_firstName();
        bankEmployee.get_lastName();

    }
}