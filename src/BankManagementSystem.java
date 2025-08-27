// BankOperations.java (Interface)
interface BankOperations {
    void deposit(double amount);
    void withdraw(double amount) throws InsufficientFundsException; // checked exception
    void checkBalance();
}

// Custom Checked Exception
class InsufficientFundsException extends Exception {
    public InsufficientFundsException(String message) {
        super(message);
    }
}

// Custom Unchecked Exception
class NegativeAmountException extends RuntimeException {
    public NegativeAmountException(String message) {
        super(message);
    }
}

// BankAccount.java (Implements interface)
class BankAccount implements BankOperations {
    private String accountHolder;
    private double balance;

    // Constructor
    public BankAccount(String accountHolder, double initialBalance) {
        this.accountHolder = accountHolder;
        if (initialBalance < 0) {
            throw new NegativeAmountException("Initial balance cannot be negative!");
        }
        this.balance = initialBalance;
    }

    // Deposit method
    @Override
    public void deposit(double amount) {
        if (amount < 0) {
            throw new NegativeAmountException("Deposit amount cannot be negative!");
        }
        balance += amount;
        System.out.println("Deposited: " + amount + " | New Balance: " + balance);
    }

    // Withdraw method (throws Checked Exception)
    @Override
    public void withdraw(double amount) throws InsufficientFundsException {
        if (amount < 0) {
            throw new NegativeAmountException("Withdrawal amount cannot be negative!");
        }
        if (amount > balance) {
            throw new InsufficientFundsException("Insufficient funds! Available: " + balance);
        }
        balance -= amount;
        System.out.println("Withdrawn: " + amount + " | New Balance: " + balance);
    }

    // Check balance
    @Override
    public void checkBalance() {
        System.out.println(accountHolder + "'s Balance: " + balance);
    }
}

// Main.java (Test the system)
public class BankManagementSystem {
    public static void main(String[] args) {
        BankAccount account = null;

        try {
            // Creating account with positive balance
            account = new BankAccount("Ziaurrehman", 1000);

            // Deposit
            account.deposit(500);

            // Withdraw valid amount
            account.withdraw(200);

            // Withdraw more than balance -> Checked Exception
            account.withdraw(2000);

        } catch (InsufficientFundsException e) {
            System.out.println("Checked Exception Caught: " + e.getMessage());
        } catch (NegativeAmountException e) {
            System.out.println("Unchecked Exception Caught: " + e.getMessage());
        } finally {
            // Always executed
            System.out.println("Transaction process completed ✅");
        }

        if (account != null) {
            account.checkBalance();
        }
    }
}
