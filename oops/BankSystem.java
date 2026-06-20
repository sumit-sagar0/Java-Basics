// Abstraction using Interface
interface Transaction {
    void displayBalance();
}

// Base Class (Encapsulation)
class BankAccount implements Transaction {
    private String holderName; // Encapsulation: private fields
    protected double balance;

    public BankAccount(String holderName, double balance) {
        this.holderName = holderName;
        this.balance = balance;
    }

    // Getter for Name
    public String getHolderName() { return holderName; }

    // Overloaded Method (Polymorphism: Overloading)
    public void deposit(double amount) {
        balance += amount;
        System.out.println(amount + " deposited.");
    }

    @Override
    public void displayBalance() {
        System.out.println(holderName + "'s Balance: Rs." + balance);
    }
}

// Inheritance (Child Class)
class SavingsAccount extends BankAccount {
    private double interestRate = 4.5;

    public SavingsAccount(String holderName, double balance) {
        super(holderName, balance); // Calling parent constructor
    }

    // Overriding Method (Polymorphism: Overriding)
    @Override
    public void displayBalance() {
        System.out.println("[Savings] " + getHolderName() + "'s Total Balance with Interest: Rs." + (balance + (balance * interestRate / 100)));
    }
}

public class BankSystem {
    public static void main(String[] args) {
        BankAccount acc = new SavingsAccount("Monika", 10000);
        acc.deposit(2000);
        acc.displayBalance();
    }
}