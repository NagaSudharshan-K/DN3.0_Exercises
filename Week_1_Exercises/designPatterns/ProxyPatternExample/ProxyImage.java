public class ProxyImage implements Image{
    public RealImage img;
    public ProxyImage(){

    }
    public void display(){
        if(img==null)
            img = new RealImage();
        img.display();
    }
}