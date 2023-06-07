package june7th;
import java.util.Arrays;
public class reversearray {

        static int[] rev = new int[]{1,2,3,4,5,6,7,8,9};

        public static void main(String[] args) {
            for (int i=0;i<(rev.length)/2;i++) {
                int temp=rev[i];
                rev[i]=rev[rev.length-i-1];
                rev[rev.length-i-1]=temp;
            }
            System.out.print(Arrays.toString(rev));

        }

    }

