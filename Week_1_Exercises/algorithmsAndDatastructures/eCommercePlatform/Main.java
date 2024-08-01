import java.util.Arrays;
import java.util.Comparator;

public class Main {
    private Product[] products;

    public Main(Product[] products) {
        this.products = products;
    }

    public Product linearSearch(String productId) {
        for (Product product : products) {
            if (product.getProductId().equals(productId)) {
                return product;
            }
        }
        return null;
    }

    public Product binarySearch(String productId) {
        Arrays.sort(products, Comparator.comparing(Product::getProductId));
        int left = 0;
        int right = products.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            int comparison = products[mid].getProductId().compareTo(productId);
            if (comparison == 0) {
                return products[mid];
            } else if (comparison < 0) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        Product[] products = {
            new Product("1", "Laptop", "Electronics"),
            new Product("2", "Smartphone", "Electronics"),
            new Product("3", "Tablet", "Electronics"),
            new Product("4", "Headphones", "Accessories")
        };

        Main searchFunctionality = new Main(products);

        System.out.println("Linear Search:");
        Product result = searchFunctionality.linearSearch("2");
        System.out.println(result != null ? result.getProductName() : "Product not found");

        System.out.println("Binary Search:");
        result = searchFunctionality.binarySearch("2");
        System.out.println(result != null ? result.getProductName() : "Product not found");
    }
}
