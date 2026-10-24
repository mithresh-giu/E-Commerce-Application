import java.util.Scanner;

class Product {

    // Private Data Members (Access Specifier)
    private int productId;
    private String productName;
    private double price;

    // Static Variable
    static String storeName = "Mithresh E-Commerce Store";

    // Constructor
    public Product(int id, String name, double price) {
        this.productId = id;
        this.productName = name;
        this.price = price;
    }

    // Method
    public void displayProduct() {
        System.out.println("\n----- Product Details -----");
        System.out.println("Store Name   : " + storeName);
        System.out.println("Product ID   : " + productId);
        System.out.println("Product Name : " + productName);
        System.out.println("Price        : Rs." + price);
    }

    // Method Overloading
    public void calculateBill() {
        System.out.println("Total Bill : Rs." + price);
    }

    public void calculateBill(int quantity) {
        double total = quantity * price;
        System.out.println("Quantity   : " + quantity);
        System.out.println("Total Bill : Rs." + total);
    }
}

public class EcommerceApplication {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("===== E-COMMERCE APPLICATION =====");

        // Input
        System.out.print("Enter Product ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Product Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Product Price: ");
        double price = sc.nextDouble();

        System.out.print("Enter Quantity: ");
        int quantity = sc.nextInt();

        // Object Creation
        Product p1 = new Product(id, name, price);

        // Calling Methods
        p1.displayProduct();

        System.out.println("\n----- Bill -----");

        // Method Overloading
        p1.calculateBill();
        p1.calculateBill(quantity);

        sc.close();
    }
}
