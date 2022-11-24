package voorbeelden.opdracht7;

public class Planeet {
    // instantie eigenschappen
    private String naam;
    private int diameter;
    private long afstandzon; // Uranus ligt te ver om een int te gebruiken

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public void setDiameter(int diameter) {
        this.diameter = diameter;
    }

    public void setAfstandzon(long afstandzon) {
        this.afstandzon = afstandzon;
    }

    public String getNaam() {
        return naam;
    }

    public int getDiameter() {
        return diameter;
    }

    public long getAfstandzon() {
        return afstandzon;
    }
}
