package week1.june2nd;

public class june2ndProduct {
public static void main(String args[]){
    Product pctd = new Product();
    pctd.setPrize(100);
    double prize=pctd.getPrize(50);
    System.out.println(prize);
    }

}
class Product{
    private double prize;
    private int quantity;

    public double getPrize() {
        return prize;
    }
    public double getPrize(int quantity) {
        return quantity*prize;
    }

    public void setPrize(double prize) {
        this.prize = prize;
    }
}