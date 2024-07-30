public abstract class NotifierDecorator implements Notifier{
    Notifier instance;
    public NotifierDecorator(Notifier instance){
        this.instance=instance;
    }
    public String send(){
        return instance.send();
    }
}