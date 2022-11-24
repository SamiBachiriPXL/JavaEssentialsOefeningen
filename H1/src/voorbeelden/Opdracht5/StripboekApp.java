package voorbeelden.Opdracht5;

public class StripboekApp {
    public static void main(String[] args) {
        Stripboek strip = new Stripboek();
        strip.setTitel("De nacht van Narwal");
        strip.setReeks("Suske en Wiske");
        strip.setAuteur("Willy Vandersteen");
        strip.setAlbum(350);
        System.out.println(strip.getReeks());
        System.out.println(strip.getAlbum() + ". " + strip.getTitel());
        System.out.println(strip.getAuteur());
    }


}
