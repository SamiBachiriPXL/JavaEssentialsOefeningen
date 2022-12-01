package Voorbeelden.Opdracht4;

public class Klasgroep {
    private String naam;
    private int aantalStudenten;

    public static final int MAX = 48;

    private static int teller;

    private static int totaalAantalStudenten;

    public Klasgroep(){
        this("1tinx", 0);
    }

    public Klasgroep(String naam, int aantalStudenten) {
        this.naam = naam;
        setAantalStudenten(aantalStudenten);
        teller++;
    }

    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public int getAantalStudenten() {
        return aantalStudenten;
    }

    public void setAantalStudenten(int aantalStudenten) {
        if (aantalStudenten>MAX){
            aantalStudenten = MAX;
        }
        totaalAantalStudenten +=aantalStudenten;
        this.aantalStudenten = aantalStudenten;
    }

    public static int getTeller() {
        return teller;
    }

    public static int getTotaalAantalStudenten() {
        return totaalAantalStudenten;
    }
}
