package collectionsTransformation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FilterPrimeNumbers {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13));
        list.stream().filter(e -> {
            if (e < 2)
                return false;
            int factors = 0;
            for (int i = 1; i < e; i++) {
                if (e % i == 0)
                    factors++;
            }
            return factors == 1;
        }).forEach(System.out::println);

    }
}

/*
Given a list of words, use a stream to return a string that contains all the words concatenated together,
separated by a specific delimiter.
*/
