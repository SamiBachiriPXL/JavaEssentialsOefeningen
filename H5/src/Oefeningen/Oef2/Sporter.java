package Oefeningen.Oef2;

import Oefeningen.Oef1.Persoon;

public class Sporter extends Persoon{
    private String omschrijving;
    private static int aantal;

    public Sporter(String voornaam, String naam) {
        this(voornaam, naam, "onbepaald");
    }

    public Sporter(String voornaam, String naam, String omschrijving) {
        super(voornaam, naam);
        this.omschrijving = omschrijving;
        aantal++;
    }

    public static int getAantal() {
        return aantal;
    }

    public String getOmschrijving() {
        return omschrijving;
    }

    public void print(){
        System.out.println(getVoornaam() + " " + getNaam());
        System.out.println(omschrijving);
    }
}
