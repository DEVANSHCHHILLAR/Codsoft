package ATMInterface;

public class ATM {
    private BankAccount account;

    public ATM(BankAccount account) {
        this.account = account;
    }

    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Amount must be greater than zero.");
        } else if (amount > account.getBalance()) {
            System.out.println("Insufficient balance.");
        } else {
            account.withdraw(amount);
            System.out.println("Withdrawn: " + amount);
            checkBalance();
        }
    }

    public void deposit(double amount) {
        if (amount <= 0) {
            System.out.println("Amount must be greater than zero.");
        } else {
            account.deposit(amount);
            System.out.println("Deposited: " + amount);
            checkBalance();
        }
    }

    public void checkBalance() {
        System.out.println("Current balance: " + account.getBalance());
    }
}

