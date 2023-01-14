package collectionsTransformation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SortAlphabeticallyDescending {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(Arrays.asList("Pen", "Phone", "Car", "Book", "Chair",
                "Lamps", "Computer", "Picture frame", "Couch", "Bicycle"));

        list.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
    }
}
