package Oefeningen.Oef3;

public class Vak {
    private String code;
    private String naam;
    private int aantalStudiepunten;

    public Vak(String code, String naam, int aantalStudiepunten) {
        this.code = code;
        this.naam = naam;
        this.aantalStudiepunten = aantalStudiepunten;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public int getAantalStudiepunten() {
        return aantalStudiepunten;
    }

    public void setAantalStudiepunten(int aantalStudiepunten) {
        this.aantalStudiepunten = aantalStudiepunten;
    }
}
