public class SMSNotifierDecorator extends NotifierDecorator{
    public SMSNotifierDecorator(Notifier instance){
        super(instance);
    }
    public String send(){
        return super.send() + " and SMS!";
    }
}