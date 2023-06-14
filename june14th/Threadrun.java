package june14th;



class Thread2 implements Runnable{
    @Override
    public void run() {
        for(int i=1;i<=10;i++){
            System.out.println(i);
        }
    }
}
public class Threadrun {
    public static void main(String[] args) {
        Thread2 r=new Thread2();
        Thread t2=new Thread(r);
        t2.start();

    }

}
