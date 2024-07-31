public class StrategyPattern {
    public static void main(String[] args) {
        PaymentContext context = new PaymentContext();
        context.setPaymentStrategy(new CreditCardPayment());
        context.executePayment();
        context.setPaymentStrategy(new PayPalPayment());
        context.executePayment();
    }
}
