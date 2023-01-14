package collectionsTransformation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SpecificLengthWords {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(Arrays.asList("Pen", "Phone", "Car", "Book", "Chair",
                "Lamps", "Computer", "Picture frame", "Couch", "Bicycle"));

        List<String> filteredList = list.stream()
                .filter(e -> e.length() == 5)
                .collect(Collectors.toList());

        filteredList.stream().forEach(System.out::println);
    }
}
