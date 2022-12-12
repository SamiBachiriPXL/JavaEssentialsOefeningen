package Oefeningen.Oef2;

public class Munt {
    private String naam;
    private double koers = 1;
    private static int AFRONDING = 3;
    private static int aantal;

    public Munt() {
    }

    public Munt(String naam, double koers) {
        this.naam = naam;
        this.koers = koers;
    }

    public String getNaam() {
        return naam.toUpperCase();
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public double getKoers() {
        return koers;
    }

    public void setKoers(double koers) {
        this.koers = koers;
    }

    public static int getAfronding() {
        return AFRONDING;
    }

    public static int getAantal() {
        return aantal;
    }
}
