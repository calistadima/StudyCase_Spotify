public class Main {
    public static void main(String[] args) {
        //membuat array of object bertipe Media atau abstract class
        Media[] playlist=new Media[3];

        playlist[0]=new Song("Birds of a Feather", "Billie Eilish", 3.3, "Pop");
        playlist[1]=new Podcast("Tech Talks", "John Doe", 35.0, "Jane Host");
        playlist[2]=new Audiobook("Harry Potter", "J.K. Rowling", 720.0, "Stephen Fry");

        System.out.println("=== ^==============^ ===");
        System.out.println("=== Spotify Playlist ===\n");

        //polymorphism : semua objek akan dipanggil melalui referensi Media
        for (Media m : playlist) {
            m.showInfo();
            m.play();
            System.out.println("--------------------------\n");
        }

        //membuat array Media khusus Song
        System.out.println("=== ^=====================^ ===");
        System.out.println("=== Array Media khusus Song ===\n");
        Media[] songs = {
            new Song("Perfect", "Ed Sheeran", 4.2, "Romantic"),
            new Song("Blinding Lights", "The Weeknd", 3.5, "Synthwave")
        };

        for (Media s : songs) {
            s.showInfo();
            s.play();
            System.out.println("--------------------------");
        }
    }
}
  
