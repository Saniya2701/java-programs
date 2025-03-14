class BankAccount {
    private double balance;
    public BankAccount(double initialBalance) {
        balance = initialBalance;
    }
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrew: " + amount);
        } else {
            System.out.println("Insufficient balance or invalid amount.");
        }
    }
    public double getBalance() {
        return balance;
    }
}
class SavingsAccount extends BankAccount {
    public SavingsAccount(double initialBalance) {
        super(initialBalance);
    }
    public void withdraw(double amount) {
        if (getBalance() - amount < 100) {
            System.out.println("Withdrawal denied: Balance cannot fall below 100.");
        } else {
            super.withdraw(amount);
        }
    }
}
public class Main {
    public static void main(String[] args) {
        BankAccount myAccount = new      BankAccount(500);
        myAccount.deposit(200);
        myAccount.withdraw(150);
        System.out.println("Current Balance: " + myAccount.getBalance());
        SavingsAccount mySavingsAccount = new SavingsAccount(500);
        mySavingsAccount.deposit(200);
        mySavingsAccount.withdraw(150);
        mySavingsAccount.withdraw(450);
        System.out.println("Current Balance: " + mySavingsAccount.getBalance());
    }
}

