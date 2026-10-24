abstract class Product {

    String name;
    double price;

    Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    abstract void displayDetails();

    void showPrice() {
        System.out.println("Price: Rs." + price);
    }
}

class Laptop extends Product {

    Laptop(String name, double price) {
        super(name, price);
    }

    @Override
    void displayDetails() {
        System.out.println("Product: " + name);
        System.out.println("Category: Electronics");
    }
}

public class Main {
    public static void main(String[] args) {

        Product product = new Laptop("Gaming Laptop", 75000);

        System.out.println("=== E-COMMERCE PRODUCT ===");
        product.displayDetails();
        product.showPrice();
    }
}
