package oop;

public class BankAccountApp implements IRate {
    //Define variables
    private String accountNumber;
    String routinNumber;
    String name;
    private int ssn;
    String accountType;

    //Constructor defining

    BankAccountApp(){
        System.out.println("New account created");
    }
    //Overloading: constructors with diff number of args
    BankAccountApp(String accountStatus){
        System.out.println("New account: " + accountStatus);
    }

    //Defining of geters and seters. Encapsulation usage
    public int getSsn() {
        return ssn;
    }

    public void setSsn(int ssn) {
        this.ssn = ssn;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    //Define methods
    void deposit(int depositValue){
        if (depositValue < 5000){
            System.out.println("Your deposit value" + depositValue + " less, than 5000");
        }else {
            System.out.println("Thank you for you deposit");
        }
    }
    void withdraw(){

    }
    void checkBalance(){

    }
    void getStatus(){

    }

    //Interfaces
    public void setRate(){
        System.out.println("Set rate");
    }
    public void increaseRate(){
        System.out.println("Increase rate");
    }

}
