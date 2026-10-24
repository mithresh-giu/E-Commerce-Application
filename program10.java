class ECommerce {

    synchronized void payment() {

        System.out.println("Payment process started.");

        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            System.out.println("Thread interrupted.");
        }

        System.out.println("Payment completed.");
    }

    synchronized void delivery() {

        System.out.println("Delivery process started.");

        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            System.out.println("Thread interrupted.");
        }

        System.out.println("Delivery completed.");
    }
}

class OrderThread extends Thread {

    ECommerce shop;

    OrderThread(ECommerce shop) {
        this.shop = shop;
    }

    public void run() {

        shop.payment();
        shop.delivery();
    }
}

public class Main {

    public static void main(String[] args) {

        System.out.println("=== E-COMMERCE APPLICATION ===");

        ECommerce shop = new ECommerce();

        OrderThread t1 = new OrderThread(shop);
        OrderThread t2 = new OrderThread(shop);

        t1.start();
        t2.start();
    }
}
