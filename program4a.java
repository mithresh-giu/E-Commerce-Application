class Product {
    String name;
    double price;

    void displayProduct() {
        System.out.println("Product Name: " + name);
        System.out.println("Price: $" + price);
    }
}

// Child Class
class Electronics extends Product {
    String brand;

    void displayElectronics() {
        displayProduct();
        System.out.println("Brand: " + brand);
    }
}

// Main Class
public class SingleInheritanceDemo {
    public static void main(String[] args) {
        Electronics e = new Electronics();

        e.name = "Laptop";
        e.price = 75000;
        e.brand = "Dell";

        e.displayElectronics();
    }
