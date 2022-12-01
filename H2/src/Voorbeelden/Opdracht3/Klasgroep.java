package Voorbeelden.Opdracht3;

public class Klasgroep {
    private String naam;
    private int aantalStudenten;

    public static final int MAX = 48;

    public Klasgroep(){
        this("1tinx", 0);
    }

    public Klasgroep(String naam, int aantalStudenten) {
        this.naam = naam;
        setAantalStudenten(aantalStudenten);
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
        this.aantalStudenten = aantalStudenten;
    }


}
