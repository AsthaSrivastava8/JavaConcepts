package collectionsTransformation;

import javax.swing.text.html.Option;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class FirstSpecificLetterWord {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(Arrays.asList("Pen", "Phone", "Car", "Book", "Chair",
                "Lamp", "Computer", "Picture frame", "Couch", "Bicycle"));
        Optional<String> specificString = Optional.ofNullable(list.stream()
                .filter(e -> e.startsWith("Q")).findFirst()).orElse(null);
        System.out.println(specificString);
    }
}
