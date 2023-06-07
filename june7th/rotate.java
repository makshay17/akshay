package june7th;
import java.util.Arrays;
public class rotate {

        static int[] rotate = new int[]{7,6,5,4,3,2,1};
        int abc=rotate.length;
        public void ans(int h) {
            for (int i=0;i<h;i++) {
                int t=rotate[0];
                for(int j=0;j<abc-1;j++) {

                    rotate[j]=rotate[j+1];
                }
                rotate[abc-1]=t;
            }

        }

        public static void main(String[] args) {
            rotate last=new rotate();
            last.ans(1);
            System.out.print(Arrays.toString(rotate));
        }

    }
