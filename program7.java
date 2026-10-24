class InsufficientBalanceException extends Exception {

    InsufficientBalanceException(String message) {
        super(message);
    }
}

class ECommerce {

    double balance = 10000;

    void purchase(double amount) throws InsufficientBalanceException {

        if (amount > balance) {
            throw new InsufficientBalanceException(
                "Insufficient balance for this purchase!"
            );
        }

        balance = balance - amount;

        System.out.println("Purchase successful!");
        System.out.println("Amount Paid : Rs." + amount);
        System.out.println("Remaining Balance : Rs." + balance);
    }
}

public class Main {

    public static void main(String[] args) {

        ECommerce customer = new ECommerce();

        try {

            System.out.println("=== E-COMMERCE APPLICATION ===");

            customer.purchase(12000);

        } catch (InsufficientBalanceException e) {

            System.out.println("Purchase Failed!");
            System.out.println("Exception: " + e.getMessage());
        }
    }
}
