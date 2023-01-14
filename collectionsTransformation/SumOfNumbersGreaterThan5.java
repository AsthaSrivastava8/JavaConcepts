package collectionsTransformation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SumOfNumbersGreaterThan5 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 6, 7, 8, 9, 10, 11, 12));

        int sum = list.stream().filter(e -> e % 5 == 0).reduce(0, Integer::sum);

        System.out.println(sum);
    }
}
