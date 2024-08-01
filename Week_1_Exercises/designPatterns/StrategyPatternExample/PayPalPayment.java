public class PayPalPayment implements PaymentStrategy {
    @Override
    public void pay() {
        System.out.println("Paid via using PayPal.");
    }
}
