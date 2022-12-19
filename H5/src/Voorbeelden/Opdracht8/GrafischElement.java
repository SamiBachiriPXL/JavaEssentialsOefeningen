package Voorbeelden.Opdracht8;

public abstract class GrafischElement {
    private int x;
    private int y;

    private static int aantal;

    public GrafischElement(int x, int y) {
        this.x = x;
        this.y = y;
        aantal++;
    }

    public void setPosition(int x, int y){
        this.x=x;
        this.y=y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public static int getAantal() {
        return aantal;
    }

    public abstract double getOmtrek();
    public abstract double getOppervlakte();
}
