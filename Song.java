public class Song extends Media {
    private String genre;

    public Song(String title, String artist, double duration, String genre) {
        super(title, artist, duration);
        this.genre = genre;
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("Genre: " + genre);
    }

    @Override
    public void play() {
        System.out.println("Playing song: " + title + " by " + artist);
    }
}
