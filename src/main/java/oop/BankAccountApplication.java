package oop;

public class BankAccountApplication {
    public static void main(String[] args) {
        BankAcc acc1 = new BankAcc("123456", 1000);
        BankAcc acc2 = new BankAcc("133457", 2000);
        BankAcc acc3 = new BankAcc("1434458", 3000);

        acc1.setName("Tim");
        System.out.println(acc1.getName());

        acc1.makeDeposit(500);
        acc1.makeDeposit(1000);
        acc1.payBill(200);
        acc1.accrue();
        System.out.println(acc1.toString());
    }
}
class BankAcc implements IInterest{
    //Init variables

    private static int iD = 1000;
    private String accountNumber;
    private static final String rountingNumber = "34362264656";
    private String name;
    private String ssn;
    private double balance;

    //Constructor init

    public BankAcc(String ssn, double balance){
        this.ssn = ssn;
        this.balance = balance;
        iD++;
        setAccountNumber();
    }

    public void setAccountNumber(){
        int random = (int) (Math.random() * 100);
        accountNumber = iD + "" + random + ssn.substring(0, 2);
        System.out.println("Your account created with number: " + accountNumber);
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void payBill(double amount){
        balance = balance - amount;
        System.out.println("Payed bill: " + amount);
        showBalance();
    }
    public void makeDeposit(double amount){
        balance = balance + amount;
        System.out.println("Deposit: " + amount);
        showBalance();
    }
    public void showBalance(){
        System.out.println("Balance: " + balance);
    }

    public void accrue(){
        balance = balance * (1 + rate/100);
        showBalance();
    }
    @Override
    public String toString(){
        return "[Name: " + name + "]\n" + "[Account Number: " + accountNumber + "]\n" +
                "[Routing Number: " + rountingNumber + "]\n" + "[Balance: " + balance + "]";
    }
}
