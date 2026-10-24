// Grandparent Class
class Product {
    String name;
    double price;

    void displayProduct() {
        System.out.println("Product Name: " + name);
        System.out.println("Price: $" + price);
    }
}

// Parent Class
class Electronics extends Product {
    String brand;

    void displayElectronics() {
        System.out.println("Brand: " + brand);
    }
}

// Child Class
class Smartphone extends Electronics {
    String operatingSystem;

    void displaySmartphone() {
        displayProduct();
        displayElectronics();
        System.out.println("Operating System: " + operatingSystem);
    }
}

// Main Class
public class MultiLevelInheritanceDemo {
    public static void main(String[] args) {
        Smartphone s = new Smartphone();

        s.name = "Galaxy S24";
        s.price = 80000;
        s.brand = "Samsung";
        s.operatingSystem = "Android";

        s.displaySmartphone();
    }
}
