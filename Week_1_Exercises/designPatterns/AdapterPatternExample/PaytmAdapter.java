public class PaytmAdapter implements PaymentProcessor{
    @Override
    public void processPayment(){
        Paytm p = new Paytm();
        p.pay();
    }
}