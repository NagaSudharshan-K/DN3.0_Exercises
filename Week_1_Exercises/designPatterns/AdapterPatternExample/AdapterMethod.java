public class AdapterMethod{
    public static void main(String args[]){
        PaymentProcessor gpay = new GpayAdapter();
        PaymentProcessor paytm = new PaytmAdapter();
        gpay.processPayment();
        paytm.processPayment();
    }
}