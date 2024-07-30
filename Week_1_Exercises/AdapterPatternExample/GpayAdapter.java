public class GpayAdapter implements PaymentProcessor{
    @Override
    public void processPayment(){
        Gpay g = new Gpay();
        g.pay();
    }
}