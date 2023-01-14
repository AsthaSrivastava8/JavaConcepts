package collectionsTransformation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class OnlyEvenNumbers {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 6, 7, 8, 9, 10));
        List<Integer> filteredList = list.stream()
                .filter(e -> e % 2 == 0)
                .collect(Collectors.toList());
        filteredList.stream().forEach(System.out::println);
    }
}
