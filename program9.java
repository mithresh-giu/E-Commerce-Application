class Order {

    boolean orderPlaced = false;

    synchronized void placeOrder() {

        orderPlaced = true;
        System.out.println("Customer: Order placed successfully.");

        notify();
    }

    synchronized void processOrder() {

        try {

            while (!orderPlaced) {
                System.out.println("Delivery: Waiting for order...");
                wait();
            }

            System.out.println("Delivery: Order received.");
            System.out.println("Delivery: Processing order...");
            System.out.println("Delivery: Order shipped successfully.");

        } catch (InterruptedException e) {
            System.out.println("Thread interrupted.");
        }
    }
}

class Customer extends Thread {

    Order order;

    Customer(Order order) {
        this.order = order;
    }

    public void run() {
        order.placeOrder();
    }
}

class Delivery extends Thread {

    Order order;

    Delivery(Order order) {
        this.order = order;
    }

    public void run() {
        order.processOrder();
    }
}

public class Main {

    public static void main(String[] args) {

        System.out.println("=== E-COMMERCE APPLICATION ===");

        Order order = new Order();

        Delivery delivery = new Delivery(order);
        Customer customer = new Customer(order);

        delivery.start();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted.");
        }

        customer.start();
    }
}
