public class Computer{
    String CPU;
    String storage;
    String RAM;

    public Computer(ComputerBuilder cb){
        this.CPU = cb.CPU;
        this.storage = cb.storage;
        this.RAM = cb.RAM;

        System.out.println("Computer build with "+ this.CPU +" "+ this.storage +" "+ this.RAM);
    }

    public static class ComputerBuilder{
        String CPU;
        String storage;
        String RAM;

        public ComputerBuilder(String CPU){
            this.CPU = CPU;
        }
        public ComputerBuilder setter(String storage, String RAM){
            this.storage = storage;
            this.RAM = RAM;
            return this;
        }
        public Computer builder(){
            return new Computer(this);
        }
    }

    public static void main(String args[]){
        Computer cb = new ComputerBuilder("Ryzen 9").builder();
        Computer cb2 = new ComputerBuilder("Ryzen 5").setter("1 TB","32GB").builder();

    }
}