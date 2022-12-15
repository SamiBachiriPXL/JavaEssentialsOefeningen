package Voorbeelden.VoorbeeldPersoon;

public class Lector extends Persoon{
    private int personeelsnummer;
    private int aanstellingspercentage;
    private int salaris;
    // opdracht 7.3
    private static int aantal;

    public Lector(String naam, String voornaam, int personeelsnummer, int aanstellingspercentage, int salaris) {
        super(naam, voornaam);
        this.personeelsnummer = personeelsnummer;
        this.aanstellingspercentage = aanstellingspercentage;
        this.salaris = salaris;
        aantal++;
    }

    public Lector(String naam, String voornaam, int aanstellingspercentage, int salaris) {
        this(naam, voornaam, 20009999, aanstellingspercentage, salaris);
    }

    public Lector() {
        this("onbekend", "onbekend", 100, 2000);
    }

    public int getPersoneelsnummer() {
        return personeelsnummer;
    }

    public void setPersoneelsnummer(int personeelsnummer) {
        this.personeelsnummer = personeelsnummer;
    }

    public int getAanstellingspercentage() {
        return aanstellingspercentage;
    }

    public void setAanstellingspercentage(int aanstellingspercentage) {
        if (this.aanstellingspercentage != 0 && salaris !=0){
            salaris = salaris * aanstellingspercentage / this.aanstellingspercentage;
        }
        this.aanstellingspercentage = aanstellingspercentage;
    }

    public int getSalaris() {
        return salaris;
    }

    public void setSalaris(int salaris) {
        this.salaris = salaris;
    }

    // opdracht 7.3

    public static int getAantal() {
        return aantal;
    }

    @Override
    public void print() {
        super.print();
        System.out.printf("Personeelsnummer %d werkt voor %d%% met een loon van %d euro%n", personeelsnummer, aanstellingspercentage, salaris);
    }
}
