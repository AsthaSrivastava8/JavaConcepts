package comparators;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CollectionsSortSong {
    public static void main(String[] args) {
        List<Movie> movieList = new ArrayList<>();
        movieList.add(new Movie("Forrest Gump", "Comedy", 1993));
        movieList.add(new Movie("Forrest Gump", "Drama", 1994));
        movieList.add(new Movie("La La Land", "Comedy", 1994));
        movieList.add(new Movie("La La Land", "Drama", 1996));
        movieList.add(new Movie("La La Land", "Musical", 1995));

        Collections.sort(movieList, Comparator.comparing(Movie::getTitle));
        movieList.stream().map(o -> o.getTitle()).forEach(System.out::println);
        System.out.println("-----------------");

        Collections.sort(movieList, Comparator.comparing(Movie::getGenre));
        movieList.stream().map(o -> o.getGenre()).forEach(System.out::println);
        System.out.println("-----------------");

        Collections.sort(movieList, Comparator.comparing(Movie::getReleaseYeaar));
        movieList.stream().map(o -> o.getReleaseYeaar()).forEach(System.out::println);
        System.out.println("-----------------");

        Comparator<Movie> comparator = Comparator.comparing(Movie::getTitle);
        comparator = comparator.thenComparing(Movie::getGenre).thenComparing(Movie::getReleaseYeaar);
        Collections.sort(movieList, comparator);

        movieList.stream().map(e -> e.getTitle() + " - " + e.getGenre() + " - " + e.getReleaseYeaar()).forEach(System.out::println);
    }

    static class Movie {
        private String title;

        public String getTitle() {
            return title;
        }

        public String getGenre() {
            return genre;
        }

        public int getReleaseYeaar() {
            return releaseYeaar;
        }

        private String genre;
        private int releaseYeaar;

        public Movie(String title, String genre, int releaseYeaar) {
            this.title = title;
            this.genre = genre;
            this.releaseYeaar = releaseYeaar;
        }
    }

}
