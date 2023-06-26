package june19;
import java.util.ArrayList;
import java.util.*;

public class List {
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<String>();


        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");

        // for loop

        for (int i = 0; i < cars.size(); i++) {
            System.out.println(cars.get(i));
        }
        //for each loop
        {
            for (String i : cars)

                System.out.print(i + " ");
        }
        //Iterator
        {
            Iterator it = cars.iterator();

            while (it.hasNext())
                System.out.print(it.next() + " ");
        }
    }
}