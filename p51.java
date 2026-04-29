import java.util.LinkedList;

public class MusicPlaylist {
    public static void main(String[] args) {

        // Create playlist using LinkedList
        LinkedList<String> playlist = new LinkedList<>();

        // 1. Add songs to playlist
        playlist.add("Song A");
        playlist.add("Song B");
        playlist.add("Song C");
        playlist.add("Song D");
        playlist.add("Song E");

        // 2. Display full playlist
        System.out.println("Full Playlist:");
        displayPlaylist(playlist);

        // 3. Play first song (remove from front)
        System.out.println("\nPlaying first song: " + playlist.removeFirst());
        System.out.println("Playlist after playing first song:");
        displayPlaylist(playlist);

        // 4. Skip last song (remove from end)
        System.out.println("\nSkipping last song: " + playlist.removeLast());
        System.out.println("Playlist after skipping last song:");
        displayPlaylist(playlist);
    }

    // Method to display playlist
    static void displayPlaylist(LinkedList<String> playlist) {
        for (String song : playlist) {
            System.out.println(song);
        }
    }
}
