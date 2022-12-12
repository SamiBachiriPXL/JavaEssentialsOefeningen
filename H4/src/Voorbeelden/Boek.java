package Voorbeelden;

public class Boek {
    private String isbn;
    private String titel;
    private int bladzijden;
    private Auteur auteur;

    public Boek() {
//        auteur = new Auteur("onbekend", "onbekend");
//        isbn = "onbekend";
//        titel = "onbekend";
        this("onbekend", "onbekend", 0, new Auteur("onbekend", "onbekend")); // vermijd dubbele code
    }

    public Boek(String isbn, String titel, int bladzijden, Auteur auteur) {
        this.isbn = isbn;
        this.titel = titel;
        this.bladzijden = bladzijden;
        this.auteur = auteur;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitel() {
        return titel;
    }

    public void setTitel(String titel) {
        this.titel = titel;
    }

    public int getBladzijden() {
        return bladzijden;
    }

    public void setBladzijden(int bladzijden) {
        this.bladzijden = bladzijden;
    }

    public Auteur getAuteur() {
        return auteur;
    }

    public void setAuteur(Auteur auteur) {
        this.auteur = auteur;
    }

    public void toonBoekGegevens(){
        System.out.printf("Boek: %s geschreven door %s%n", titel, auteur.toString());
        System.out.printf("aantal bladzijden %d met isbnnummer %s%n", bladzijden, isbn);
    }
}
