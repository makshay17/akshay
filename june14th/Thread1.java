package june14th;

import java.awt.*;

class newthread extends Thread {

    public void run() {

        for(int i=1; i<=10; i++) {
            System.out.println(i);
        }
    }
}
public class Thread1 {

    public static void main(String[] args) {

        new newthread().start();

    }
}