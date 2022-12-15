package Oefeningen.Oef1;

public class Persoon {
    private String voornaam;
    private String naam;

    public Persoon(String naam, String voornaam) {
        this.voornaam = voornaam;
        this.naam = naam;
    }

    public String getVoornaam() {
        return voornaam;
    }

    public void setVoornaam(String voornaam) {
        this.voornaam = voornaam;
    }

    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public void print(){
        System.out.printf("%s is de voornaam en %s is achternaam%n", voornaam, naam);
    }
}
