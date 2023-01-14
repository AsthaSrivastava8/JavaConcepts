package collectionsTransformation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MaxAndMin {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));

        int max = list.stream().reduce(Integer.MIN_VALUE, Integer::max);
        int min = list.stream().min(Integer::compare).get();

        System.out.println("Max: " + max + "\nMin: " + min);
    }
}
