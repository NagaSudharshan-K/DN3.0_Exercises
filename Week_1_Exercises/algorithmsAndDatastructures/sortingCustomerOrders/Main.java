public class Main {
    public static void main(String[] args) {
        Order[] orders = {
            new Order("1", "Alice", 200.00),
            new Order("2", "Bob", 150.00),
            new Order("3", "Charlie", 250.00),
            new Order("4", "Dave", 100.00)
        };

        BubbleSort bubbleSort = new BubbleSort();
        bubbleSort.sort(orders);
        System.out.println("Orders sorted by Bubble Sort:");
        printOrders(orders);

        Order[] orders2 = {
            new Order("1", "Alice", 200.00),
            new Order("2", "Bob", 150.00),
            new Order("3", "Charlie", 250.00),
            new Order("4", "Dave", 100.00)
        };

        QuickSort quickSort = new QuickSort();
        quickSort.sort(orders2);
        System.out.println("Orders sorted by Quick Sort:");
        printOrders(orders2);
    }

    private static void printOrders(Order[] orders) {
        for (Order order : orders) {
            System.out.println("Order ID: " + order.getOrderId() +
                               ", Customer Name: " + order.getCustomerName() +
                               ", Total Price: $" + order.getTotalPrice());
        }
    }
}
