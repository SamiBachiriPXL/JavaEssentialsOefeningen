package Opdracht;

import java.util.Objects;

public class Rechthoek extends GrafischElement implements Schaalbaar {
    private double hoogte;
    private double breedte;

    public Rechthoek(int x, int y,
                     double hoogte, double breedte) {
        super(x, y);
        setHoogte(hoogte);
        setBreedte(breedte);
    }

    public Rechthoek() {
        this(0, 0, 0, 0);
    }

    public Rechthoek(double hoogte, double breedte) {
        this(0, 0, hoogte, breedte);
    }
//andere methoden


    public double getHoogte() {
        return hoogte;
    }

    public void setHoogte(double hoogte) {
        if (hoogte < 0) {
            this.hoogte = -hoogte;
        } else {
            this.hoogte = hoogte;
        }
    }

    public double getBreedte() {
        return breedte;
    }

    public void setBreedte(double breedte) {
        if (breedte < 0) {
            this.breedte = -breedte;
        } else {
            this.breedte = breedte;
        }
    }

    public double getOppervlakte() {
        return breedte * hoogte;
    }

    public double getOmtrek() {
        return 2 * (breedte + hoogte);
    }

    @Override
    public String toString() {
        return String.format("Rechthoek met hoogte %.0f, breedte %.0f op positie (%d,%d)",
                hoogte, breedte, getX(), getY());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Rechthoek)) return false;
        Rechthoek rechthoek = (Rechthoek) o;
        return getHoogte() == rechthoek.getHoogte() &&
                getBreedte() == rechthoek.getBreedte() &&
                getX() == rechthoek.getX() && getY() == rechthoek.getY();
    }

    @Override
    public int hashCode() {

        return Objects.hash(getHoogte(), getBreedte());
    }

    @Override
    public void herschaal(double factor) {
        breedte = Math.sqrt(factor) * breedte;
        hoogte = Math.sqrt(factor) * factor;
    }
}
