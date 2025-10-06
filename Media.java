public abstract class Media implements Playable {
    protected String title;
    protected String artist;
    protected double duration;

    public Media(String title, String artist, double duration) {
        this.title = title;
        this.artist = artist;
        this.duration = duration;
    }

    public String getTitle() {
        return title;
    }

    public String getArtist() {
        return artist;
    }

    public double getDuration() {
        return duration;
    }

    public void showInfo() {
        System.out.println("Title: " + title);
        System.out.println("Artist: " + artist);
        System.out.println("Duration: " + duration + " minutes");
    }

    //abstract method inherited from Playable
    public abstract void play();
}
