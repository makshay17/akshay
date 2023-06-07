package june7th;
import java.util.Arrays;
public class reversearray {

        static int[] rev = new int[]{7348,2,23,4,9,6,9};

        public static void main(String[] args) {
            for (int i=0;i<(rev.length)/2;i++) {
                int temp=rev[i];
                rev[i]=rev[rev.length-i-1];
                rev[rev.length-i-1]=temp;
            }
            System.out.print(Arrays.toString(rev));

        }

    }

