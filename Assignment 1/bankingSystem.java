import java.util.Scanner;

class BankAccount {
    private String name;
    private int accountNumber;
    private double balance;

    // Constructor
    public BankAccount(String name, int accountNumber, double initialBalance) {
        this.name = name;
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }

    // Getters
    public String getName() {
        return name;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    // Deposit method
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposit successful! Current Balance: " + balance);
        } else {
            System.out.println("Error: Invalid deposit amount.");
        }
    }

    // Withdrawal method
    public void withdraw(double amount) {
        if (amount > 0) {
            if (amount <= balance) {
                balance -= amount;
                System.out.println("Withdrawal successful! Current Balance: " + balance);
            } else {
                System.out.println("Error: Insufficient funds. Current Balance: " + balance);
            }
        } else {
            System.out.println("Error: Invalid withdrawal amount.");
        }
    }
}

public class bankingSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create a bank account
        System.out.println("Create Account:");
        System.out.print("Name: ");
        String name = scanner.nextLine();
        System.out.print("Account Number: ");
        int accountNumber = scanner.nextInt();
        System.out.print("Initial Balance: ");
        double initialBalance = scanner.nextDouble();
        BankAccount account = new BankAccount(name, accountNumber, initialBalance);

        // Perform deposit and withdrawal operations
        System.out.print("Deposit: ");
        double depositAmount = scanner.nextDouble();
        account.deposit(depositAmount);

        System.out.print("Withdraw: ");
        double withdrawAmount = scanner.nextDouble();
        account.withdraw(withdrawAmount);
    }
}
