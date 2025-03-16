package step4_OOP.topic6_BankAccount.solution;

public class BankAccount {
    private String accountNumber;
    private double balance;

    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void deposit(double amount) {
        this.balance = this.balance + amount;
    }

    public void withdraw(double amount) {
        if (this.balance >= amount) {
            this.balance = this.balance - amount;
        } else {
            System.out.println("Недостаточно средств!");
        }
    }

    public double getBalance() {
        return balance;
    }
}
