package step4_OOP.topic6_BankAccount.solution;

public class BankAccountDemo {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount("1", 100);
        System.out.println(bankAccount.getBalance());
        bankAccount.deposit(50);
        System.out.println(bankAccount.getBalance());
        bankAccount.withdraw(75);
        System.out.println(bankAccount.getBalance());
        bankAccount.withdraw(1000);
        System.out.println(bankAccount.getBalance());
    }
}
