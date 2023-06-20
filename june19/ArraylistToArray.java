package june19;
import java.util.ArrayList;
public class ArraylistToArray {
    public static void main(String[] args) {

        ArrayList<String> one = new ArrayList<String>();

        one.add("pavan");
        one.add("hari");
        one.add("kiran");
        one.add("rahul");

        String[] str1 = new String[one.size()];

        for (int i = 0; i < one.size(); i++) {
            str1[i] = one.get(i);
        }
        for (String two : str1) {
            System.out.println(two);
        }
    }
}
