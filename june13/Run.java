package june13;

public class Run {

    public void test(int x,int y) {
        try {
            if(y==0) {
                throw new Exceptionr("Divide By zero");
            }
            else {
                System.out.println(x/y);
            }
        }
        catch(Exceptionr pqr) {

            System.out.println(pqr);

        }

    }
    public static void main(String [] args) {
        Run r=new Run();
        r.test(5,0);
    }
}
