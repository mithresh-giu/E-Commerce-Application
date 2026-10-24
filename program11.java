class ECommerce {

    private boolean orderPlaced = false;

    synchronized void processOrder() {

        while (!orderPlaced) {
            System.out.println("Order not placed yet!");
            System.out.println("Delivery thread is waiting...");

            try {
                wait();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                return;
            }
        }

        System.out.println("Order received successfully!");
        System.out.println("Processing order...");
        System.out.println("Product shipped successfully!");

        notifyAll();
    }

    synchronized void placeOrder() {

        System.out.println("Customer placed the order.");
        orderPlaced = true;

        System.out.println("Order confirmed successfully!");

        notifyAll();
    }
}

class DeliveryThread extends Thread {

    ECommerce shop;

    DeliveryThread(ECommerce shop) {
        this.shop = shop;
    }

    public void run() {
        shop.processOrder();
    }
}

class CustomerThread extends Thread {

    ECommerce shop;

    CustomerThread(ECommerce shop) {
        this.shop = shop;
    }

    public void run() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            return;
        }

        shop.placeOrder();
    }
}

public class Main {

    public static void main(String[] args) {

        System.out.println("E-Commerce Application");

        ECommerce shop = new ECommerce();

        DeliveryThread t1 = new DeliveryThread(shop);
        CustomerThread t2 = new CustomerThread(shop);

        t1.start();
        t2.start();
    }
}
