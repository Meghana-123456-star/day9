
class InsufficientBalanceException extends Exception {
    public InsufficientBalanceException(String message) {
        super(message);
    }
}

public class BankWithdrawal {
    static double balance = 5000;

    static void withdraw(double amount)
            throws InsufficientBalanceException {

        if (amount <= 0) {
            throw new IllegalArgumentException(
                "Amount must be greater than zero."
            );
        }

        if (amount > balance) {
            throw new InsufficientBalanceException(
                "Insufficient bank balance."
            );
        }

        balance -= amount;
        System.out.println("Withdrawal successful.");
        System.out.println("Remaining balance: " + balance);
    }

    public static void main(String[] args) {
        try {
            withdraw(2000);
        } catch (InsufficientBalanceException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
