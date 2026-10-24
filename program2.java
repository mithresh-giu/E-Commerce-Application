class Product {

    // Private Data Members (Access Specifier)
    private int productId;
    private String productName;
    private double price;

    // Static Variable
    static String companyName = "Amazon";

    // Constructor
    public Product(int id, String name, double p) {
        productId = id;
        productName = name;
        price = p;
    }

    // Method to Display Product
    public void displayProduct() {
        System.out.println("Company      : " + companyName);
        System.out.println("Product ID   : " + productId);
        System.out.println("Product Name : " + productName);
        System.out.println("Price        : Rs." + price);
    }

    // Method Overloading
    public double calculateBill(int quantity) {
        return price * quantity;
    }

    public double calculateBill(int quantity, double discount) {
        return (price * quantity) - discount;
    }
}

class Customer {

    // Private Data Members
    private int customerId;
    private String customerName;

    // Constructor
    public Customer(int id, String name) {
        customerId = id;
        customerName = name;
    }

    // Public Method
    public void displayCustomer() {
        System.out.println("Customer ID   : " + customerId);
        System.out.println("Customer Name : " + customerName);
    }
}

public class EcommerceApplication {

    public static void main(String[] args) {

        // Creating Objects
        Customer c1 = new Customer(101, "Mithresh");
        Product p1 = new Product(501, "Gaming Mouse", 1499);

        System.out.println("===== E-COMMERCE APPLICATION =====\n");

        // Calling Methods
        c1.displayCustomer();

        System.out.println();

        p1.displayProduct();

        System.out.println();

        // Method Overloading
        double bill1 = p1.calculateBill(2);
        double bill2 = p1.calculateBill(2, 200);

        System.out.println("Bill for 2 Products           : Rs." + bill1);
        System.out.println("Bill after Rs.200 Discount    : Rs." + bill2);

        System.out.println("\nOrder Placed Successfully!");
    }
}
