public class SlackNotifierDecorator extends NotifierDecorator{
    public SlackNotifierDecorator(Notifier instance){
        super(instance);
    }
    public String send(){
        return super.send() + " and Slack!";
    }
}