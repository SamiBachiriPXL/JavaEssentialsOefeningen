package Voorbeelden.Opdracht11;

import Voorbeelden.Opdracht11.GrafischElement;

import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cirkel cirkel = (Cirkel) o;
        return getX() == cirkel.getX() && getY() == cirkel.getY() && straal == cirkel.straal;
    }

    @Override
    public int hashCode() {
        return Objects.hash(straal, getX(), getY());
    }
}
