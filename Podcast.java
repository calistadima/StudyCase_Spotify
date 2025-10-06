public class Podcast extends Media {
    private String host;

    public Podcast(String title, String artist, double duration, String host) {
        super(title, artist, duration);
        this.host = host;
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("Host: " + host);
    }

    @Override
    public void play() {
        System.out.println("Playing podcast: " + title + " hosted by " + host);
    }
}
