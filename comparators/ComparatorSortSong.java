package comparators;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ComparatorSortSong {
    public static void main(String[] args) {
        List<Song> songList = new ArrayList<>();
        songList.add(new Song("Shape of You", "Ed Sheeran", 2017));
        songList.add(new Song("Uptown Funk", "Mark Ronson ft. Bruno Mars", 2014));
        songList.add(new Song("Despacito", "Luis Fonsi ft. Daddy Yankee", 2017));
        songList.add(new Song("All of Me", "John Legend", 2013));
        songList.add(new Song("Sorry", "Justin Bieber", 2015));

        songList.stream().map(e -> e.getTitle()).forEach(System.out::println);

        System.out.println("Sort by Title");
        songList.sort(Comparator.comparing(Song::getTitle));
        songList.stream().map(e -> e.getTitle() + " by " + e.getArtist() + " released in " + e.getReleaseYear())
                .forEach(System.out::println);
        System.out.println("---------------");

        System.out.println("Sort by Release Year");
        songList.sort(Comparator.comparing(Song::getReleaseYear));
        songList.stream().map(e -> e.getTitle() + " by " + e.getArtist() + " released in " + e.getReleaseYear())
                .forEach(System.out::println);
        System.out.println("---------------");

        System.out.println("Sort by Artist in descending order");
        songList.sort((o1, o2) -> o2.getArtist().compareTo(o1.getArtist()));
        songList.stream().map(e -> e.getTitle() + " by " + e.getArtist() + " released in " + e.getReleaseYear())
                .forEach(System.out::println);
        System.out.println("---------------");

    }

    static class Song {
        private String title;
        private String artist;
        private int releaseYear;

        public Song(String title, String artist, int releaseYear) {
            this.title = title;
            this.artist = artist;
            this.releaseYear = releaseYear;
        }

        public String getTitle() {
            return title;
        }

        public String getArtist() {
            return artist;
        }

        public int getReleaseYear() {
            return releaseYear;
        }
    }
}
