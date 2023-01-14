package collectionsTransformation;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ListToMap {
    public static void main(String[] args) {
        List<Artist> artists = new ArrayList<>();
        artists.add(new Artist("Jimi Hendrix", "Guitar", 1942));
        artists.add(new Artist("Ludwig van Beethoven", "Piano", 1770));
        artists.add(new Artist("Yo-Yo Ma", "Cello", 1955));
        artists.add(new Artist("Eddie Van Halen", "Guitar", 1945));
        artists.add(new Artist("B.B. King", "Guitar", 1925));
        artists.add(new Artist("Carlos Santana", "Guitar", 1947));
        artists.add(new Artist("Franz Liszt", "Piano", 1811));
        artists.add(new Artist("Frederic Chopin", "Piano", 1811));
        artists.add(new Artist("Jacqueline Du Pré", "Cello", 1945));
        artists.add(new Artist("Mstislav Rostropovich", "Cello", 1925));

        Map<String, List<String>> byInstrument = artists.stream()
                .collect(Collectors.groupingBy(Artist::getInstrument,
                        Collectors.mapping(e -> e.getName(), Collectors.toList())));
        for (Map.Entry<String, List<String>> ele : byInstrument.entrySet()) {
            System.out.println(ele.getKey() + " " + ele.getValue().stream()
                    .collect(Collectors.toList()));
        }

        System.out.println("---------------------");

        Map<Integer, List<String>> byBirthYear = artists.stream().collect(Collectors.groupingBy(Artist::getBirthYear,
                Collectors.mapping(e -> e.getName(), Collectors.toList())));

        for (Map.Entry<Integer, List<String>> ele : byBirthYear.entrySet()) {
            System.out.println(ele.getKey() + " " + ele.getValue().stream()
                    .collect(Collectors.toList()));
        }
    }

    static class Artist {
        private String name;
        private String instrument;
        private int birthYear;

        public Artist(String name, String instrument, int birthYear) {
            this.name = name;
            this.instrument = instrument;
            this.birthYear = birthYear;
        }

        public String getName() {
            return name;
        }

        public String getInstrument() {
            return instrument;
        }

        public int getBirthYear() {
            return birthYear;
        }
    }

}