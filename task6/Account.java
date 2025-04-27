package task6;
class Account{
    // Data members
    private String accountHolderName;
    private double balance;

    // No-argument constructor
    public Account() {
        accountHolderName = "Unknown";
        balance = 0.0;
    }

    // Constructor with two arguments
    public Account(String accountHolderName, double balance) {
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }

    // Method to deposit money
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    // Method to withdraw money
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Invalid withdrawal amount or insufficient balance.");
        }
    }

    // Method to check balance
    public void checkBalance() {
        System.out.println("Current Balance: " + balance);
    }

    // Main method to test the Account class
    public static void main(String[] args) {
        Account account1 = new Account();  // No-argument constructor
        Account account2 = new Account("Alice", 1000.0);  // Two-argument constructor

        System.out.println("Account 1:");
        account1.checkBalance();
        account1.deposit(500);
        account1.withdraw(200);
        account1.checkBalance();

        System.out.println("\nAccount 2:");
        account2.checkBalance();
        account2.deposit(300);
        account2.withdraw(1500); // Trying to withdraw more than balance
        account2.withdraw(800);
        account2.checkBalance();
    }
}
