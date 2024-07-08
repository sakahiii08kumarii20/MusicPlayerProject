public class Song {
    String title;
    Song next;
    Song prev;

    Song(String title) {
        this.title = title;
        this.next = null;
        this.prev = null;
    }

    @Override
    public String toString() {
        return title;
    }
}
