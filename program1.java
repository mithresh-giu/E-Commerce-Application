class Product {
    int productId;
    String productName;
    double price;

    // Constructor
    Product(int id, String name, double p) {
        productId = id;
        productName = name;
        price = p;
    }

    // Display Product Details
    void displayProduct() {
        System.out.println("Product ID   : " + productId);
        System.out.println("Product Name : " + productName);
        System.out.println("Price        : Rs." + price);
    }
}

class Customer {
    int customerId;
    String customerName;

    // Constructor
    Customer(int id, String name) {
        customerId = id;
        customerName = name;
    }

    // Display Customer Details
    void displayCustomer() {
        System.out.println("Customer ID   : " + customerId);
        System.out.println("Customer Name : " + customerName);
    }
}

public class EcommerceApplication {
    public static void main(String[] args) {

        // Creating Objects
        Customer c1 = new Customer(101, "Mithresh");
        Product p1 = new Product(1, "Wireless Mouse", 799.0);

        System.out.println("===== E-COMMERCE APPLICATION =====\n");

        c1.displayCustomer();

        System.out.println();

        p1.displayProduct();

        System.out.println("\nOrder Status : Order Placed Successfully!");
    }
}
