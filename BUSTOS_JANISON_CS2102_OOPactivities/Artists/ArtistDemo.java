public class ArtistDemo {
    public static void main(String[] args) {
        System.out.println("Instance of Artist class:");
        Artist artist = new Artist("Charlie Puth", 32, "Music");
        artist.displayInfo();

        System.out.println();

        System.out.println("Instance of Singer class:");
        Singer singer = new Singer("Nayeon Im", 29, "Music", Genre.POP);
        singer.displayInfo();

        System.out.println();

        System.out.println("Instance of Painter class:");
        Painter painter = new Painter("Leonardo da Vinci", 67, "Visual Arts", Medium.OIL);
        painter.displayInfo();
    }
}
