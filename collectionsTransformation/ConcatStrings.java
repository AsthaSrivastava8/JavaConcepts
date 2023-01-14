package collectionsTransformation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ConcatStrings {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(Arrays.asList("Despite", "the", "fact", "that", "the",
                "forecast", "had", "called", "for", "clear", "skies", ",", "the", "hikers", "were",
                "caught", "in", "a", "sudden", "downpour", "halfway", "up", "the", "mountain",
                "trail", "and", "had", "to", "turn", "back", ",", "disappointed", "that", "their",
                "ambitious", "plans", "for", "the", "day", "had", "been", "thwarted", "by", "the",
                "unpredictable", "weather"));

        String sentence = list.stream().map(e -> e + " ").collect(Collectors.joining(" "));
        System.out.println(sentence);
    }
}
