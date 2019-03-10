package oop;

public class BankAccount {

    public static void main(String[] args) {

        BankAccountApp acc1 = new BankAccountApp();
        BankAccountApp acc2 = new BankAccountApp("Basic account");

        acc1.name = "Ivan";
        acc2.deposit(5000);

        //Encapsulation geter/seter usage
        acc1.setSsn(31232313);
        System.out.println(acc1.getSsn());

        acc2.setAccountNumber("Test number");
        System.out.println("You account number is: " + acc2.getAccountNumber());

        //Interfaces
        acc1.setRate();
        acc1.increaseRate();
    }
}
