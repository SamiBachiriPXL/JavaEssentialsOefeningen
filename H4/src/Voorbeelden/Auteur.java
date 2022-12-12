package Voorbeelden;

public class Auteur {
     private String naam;
     private String voornaam;

    public Auteur(String naam, String voornaam) {
        this.naam = naam;
        this.voornaam = voornaam;
    }

    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public String getVoornaam() {
        return voornaam;
    }

    public void setVoornaam(String voornaam) {
        this.voornaam = voornaam;
    }

    public String toString(){
        return voornaam + " " + naam;
    }

}
