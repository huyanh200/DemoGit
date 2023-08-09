package Day7.OOP;

public class DongGoi {
    private String accountNumber;
    private double balance;

    public DongGoi(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
}

public void withdraw(double amount) {
    if (amount > 0 && balance >= amount) {
        balance -= amount;
        System.out.println("Withdrawn: " + amount);
    } else {
        System.out.println("Invalid withdrawal amount or insufficient balance.");
    }
}
}
