interface Payment {
    void makePayment();
}

interface Delivery {
    void deliverProduct();
}

class Order implements Payment, Delivery {

    public void makePayment() {
        System.out.println("Payment completed successfully.");
    }

    public void deliverProduct() {
        System.out.println("Product will be delivered soon.");
    }
}

public class Main {
    public static void main(String[] args) {

        Order order = new Order();

        System.out.println("=== E-COMMERCE ORDER ===");
        order.makePayment();
        order.deliverProduct();
    }
}
