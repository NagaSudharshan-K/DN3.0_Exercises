public class DecoratorMethod{
    public static void main(String args[]){
        Notifier email = new EmailNotifier();
        Notifier sms = new SMSNotifierDecorator(email);
        Notifier slack = new SlackNotifierDecorator(email);

        System.out.println(email.send());
        System.out.println(sms.send());
        System.out.println(slack.send());
    }
}