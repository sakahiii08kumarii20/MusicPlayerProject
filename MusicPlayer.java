public class MusicPlayer {
    private Song head;
    private Song tail;

    public MusicPlayer() {
        this.head = null;
        this.tail = null;
    }

    // Add a song to the beginning of the list
    public void addSongAtBeginning(String title) {
        Song newSong = new Song(title);
        if (head == null) {
            head = newSong;
            tail = newSong;
        } else {
            newSong.next = head;
            head.prev = newSong;
            head = newSong;
        }
    }

    // Add a song to the end of the list
    public void addSongAtEnd(String title) {
        Song newSong = new Song(title);
        if (tail == null) {
            head = newSong;
            tail = newSong;
        } else {
            tail.next = newSong;
            newSong.prev = tail;
            tail = newSong;
        }
    }

    // Play the songs from beginning to end
    public void playForward() {
        Song current = head;
        while (current != null) {
            System.out.println("Playing: " + current);
            current = current.next;
        }
    }

    // Play the songs from end to beginning
    public void playBackward() {
        Song current = tail;
        while (current != null) {
            System.out.println("Playing: " + current);
            current = current.prev;
        }
    }

    public static void main(String[] args) {
        MusicPlayer player = new MusicPlayer();
        player.addSongAtBeginning("Song A");
        player.addSongAtBeginning("Song B");
        player.addSongAtEnd("Song C");

        System.out.println("Playing songs forward:");
        player.playForward();

        System.out.println("\nPlaying songs backward:");
        player.playBackward();
    }
}
