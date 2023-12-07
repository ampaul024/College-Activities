import java.util.ArrayList;

public class LinkedList {
    public static void main(String[] args) {

        ArrayList<String> artist = new ArrayList<>();
        ArrayList<String> song = new ArrayList<>();
        ArrayList<String> album = new ArrayList<>();

        artist.add("Playboi Carti");// 1
        artist.add("Mac Miller");// 2
        artist.add("Eminem");// 3
        artist.add("Kendrick Lamar");// 4
        artist.add("Post Malone");// 5

        song.add("Sky");// 1
        song.add("Self Care");// 2
        song.add("Till I Collapse");// 3
        song.add("DNA");// 4
        song.add("Circles");// 5

        album.add("Whole Lotta Red");// 1
        album.add("Swimming");// 2
        album.add("The Eminem Show");// 3
        album.add("DAMN.");// 4
        album.add("Hollywood's Bleeding");// 5

        System.out.printf("%-20s %-20s %-20s\n", "Song:", "Artist:", "Album:");
        System.out.println(" ");
        System.out.printf("%-20s %-20s %-20s\n", song.get(0), artist.get(0), album.get(0));
        System.out.printf("%-20s %-20s %-20s\n", song.get(1), artist.get(1), album.get(1));
        System.out.printf("%-20s %-20s %-20s\n", song.get(2), artist.get(2), album.get(2));
        System.out.printf("%-20s %-20s %-20s\n", song.get(3), artist.get(3), album.get(3));
        System.out.printf("%-20s %-20s %-20s\n", song.get(4), artist.get(4), album.get(4));

    }

}
