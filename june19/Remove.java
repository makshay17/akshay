package june19;
import java.util.List;
import java.util.ArrayList;

public class Remove {
    public static void main(String[] args)
    {
        List<Integer> last = new ArrayList<>();
        last.add(123);
        last.add(456);
        last.add(789);
        last.add(198);
        last.add(765);

        int index = last.size() - 1;

        last.remove(index);

        System.out.println("The last object in the ArrayList: " + last);
    }
}

