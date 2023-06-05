package week1;

public class june5thBike implements Bikeone,Biketwo {
    @Override
    public void tyre() {
        System.out.println("mrf");
    }

    @Override
    public void brand() {
        System.out.println("BMW");
    }
    public static void main(String[] args){
        june5thBike Hero = new june5thBike();
        Hero.brand();
        Hero.tyre();
    }
}

interface Bikeone{
    public void tyre();
}
interface  Biketwo{
    public void brand();
}


