package Voorbeelden.Opdracht9;

public class Cirkel extends GrafischElement {
    private double straal;

    public Cirkel(int x, int y, double straal) {
        super(x, y);
        this.straal = straal;
    }

    @Override
    public double getOmtrek() {
        return 2*Math.PI*straal;
    }

    @Override
    public double getOppervlakte() {
        return Math.PI*straal*straal;
    }

    public String toString(){
        return String.format("De cirkel met straal %.1f op plaats (%d, %d)", straal, getX(), getY());
    }
}
