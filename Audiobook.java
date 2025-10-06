public class Audiobook extends Media {
    private String narrator;

    public Audiobook(String title, String artist, double duration, String narrator) {
        super(title, artist, duration);
        this.narrator = narrator;
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("Narrator: " + narrator);
    }

    @Override
    public void play() {
        System.out.println("Playing audiobook: " + title + " narrated by " + narrator);
    }
}

