package Voorbeelden.VoorbeeldPersoon;

public class Persoon {
    private String naam;
    private String voornaam;
    // opdracht 7.1
    private static int aantal;

    public Persoon(String naam, String voornaam) {
        this.naam = naam;
        this.voornaam = voornaam;
        aantal++; // opdracht 7.1
    }
    public Persoon() {
        aantal++;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public void setVoornaam(String voornaam) {
        this.voornaam = voornaam;
    }

    public String getNaam() {
        return naam;
    }

    public String getVoornaam() {
        return voornaam;
    }
    // opdracht 7.1


    public static int getAantal() {
        return aantal;
    }


    public void print(){
        System.out.printf("%s %s%n", voornaam, naam);
    }
}
