package be.pxl.h1.Oefening1;

public class Toren {
    private String naam;
    private String Stad;
    private int datum;
    private int hoogte;
    private int aantalVerdiepingen;

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public void setStad(String stad) {
        Stad = stad;
    }

    public void setDatum(int datum) {
        this.datum = datum;
    }

    public void setHoogte(int hoogte) {
        this.hoogte = hoogte;
    }

    public void setAantalVerdiepingen(int aantalVerdiepingen) {
        this.aantalVerdiepingen = aantalVerdiepingen;
    }

    public String getNaam() {
        return naam;
    }

    public String getStad() {
        return Stad;
    }

    public int getDatum() {
        return datum;
    }

    public int getHoogte() {
        return hoogte;
    }

    public int getAantalVerdiepingen() {
        return aantalVerdiepingen;
    }
}
