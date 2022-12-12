package Voorbeelden;

public class BoekApp {
    public static void main(String[] args) {
        Boek boek = new Boek();
        boek.setTitel("De onschuldigen");
        boek.setIsbn("9789400510951");
        boek.setBladzijden(496);
        boek.setAuteur(new Auteur("Grisham", "John"));
        boek.toonBoekGegevens();
        // alternate oplossing zonder een nieuw object Auteur aan te maken
        boek.getAuteur().setNaam("Grisham");
        boek.getAuteur().setVoornaam("John");
        boek.toonBoekGegevens();
    }
}
