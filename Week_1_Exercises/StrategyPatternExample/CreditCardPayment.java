public class CreditCardPayment implements PaymentStrategy {
    @Override
    public void pay() {
        System.out.println("Paid via Credit Card.");
    }
}
