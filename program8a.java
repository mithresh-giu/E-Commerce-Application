class OrderThread extends Thread {

    String product;

    OrderThread(String product) {
        this.product = product;
    }

    public void run() {
        System.out.println("Processing Order...");
        System.out.println("Product: " + product);
        System.out.println("Order Confirmed!");
    }
}

public class Main {

    public static void main(String[] args) {

        System.out.println("=== E-COMMERCE APPLICATION ===");

        OrderThread order = new OrderThread("Gaming Laptop");

        order.start();
    }
}
