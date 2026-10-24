class OrderProcess implements Runnable {

    String product;

    OrderProcess(String product) {
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

        OrderProcess order = new OrderProcess("Smartphone");

        Thread thread = new Thread(order);

        thread.start();
    }
}
