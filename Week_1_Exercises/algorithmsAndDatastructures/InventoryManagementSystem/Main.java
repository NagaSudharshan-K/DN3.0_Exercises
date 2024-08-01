import java.util.*;

public class Main {
    public static void main(String[] args) {
        Inventory ims = new Inventory();

        Product p1 = new Product("1", "Laptop", 10, 999.99);
        Product p2 = new Product("2", "Smartphone", 25, 499.99);
        Product p3 = new Product("3", "Tablet", 15, 299.99);

        ims.addProduct(p1);
        ims.addProduct(p2);
        ims.addProduct(p3);

        System.out.println("Initial Inventory:");
        ims.printInventory();

        ims.updateProduct("1", 8, 950.00);
        ims.updateProduct("2", 30, 450.00);

        System.out.println("\nUpdated Inventory:");
        ims.printInventory();

        ims.deleteProduct("3");

        System.out.println("\nFinal Inventory:");
        ims.printInventory();
    }
}