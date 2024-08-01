import java.util.*;

public class Inventory {
    private Map<String, Product> inventory;

    public Inventory() {
        inventory = new HashMap<>();
    }

    public void addProduct(Product product) {
        inventory.put(product.getProductId(), product);
    }

    public void updateProduct(String productId, int quantity, double price) {
        Product product = inventory.get(productId);
        if (product != null) {
            product.setQuantity(quantity);
            product.setPrice(price);
        }
    }

    public void deleteProduct(String productId) {
        inventory.remove(productId);
    }

    public Product getProduct(String productId) {
        return inventory.get(productId);
    }

    public void printInventory() {
        for (Product product : inventory.values()) {
            System.out.println("Product ID: " + product.getProductId() +
                    ", Name: " + product.getProductName() +
                    ", Quantity: " + product.getQuantity() +
                    ", Price: $" + product.getPrice());
        }
    }
}