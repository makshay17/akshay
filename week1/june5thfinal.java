package week1;

public class june5thfinal {
    public static void main(String args[]){
        first last = new first();
        int y=last.x;
        last.three();
        System.out.println(y);
    }
}
final class first {
    int x=25;

final void three(){
    System.out.println("final method");
}
}