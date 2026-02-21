package OOPs.Programs;

public class BankAccount {
    String accountHolder;
    double balance;

    BankAccount(String accountHolder, double balance){
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    void deposit(double amount){
        balance = balance + amount;
        System.out.println("Amount Deposited: " + amount);
        System.out.println("Updated Balance: " + balance);
    }

    void withdraw(double amount){
        if(amount <= balance){
            balance = balance - amount;
            System.out.println("Amount Withdrawn: " + amount);
        }else{
            System.out.println("Insuffienct Balance!");
        }
    }

    void display(){
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Current Balance: " + balance);
    }
}

class Driver{
    public static void main(String[] args) {
        BankAccount acct = new BankAccount("Ashank", 10000);
        acct.display();
        acct.deposit(5000);
        acct.display();
        acct.withdraw(6000);
        acct.display();
        acct.withdraw(10000);
        acct.display();
    }
}