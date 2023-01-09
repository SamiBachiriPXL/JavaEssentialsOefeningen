package Oefeningen.Oef1;

public class Kleur {
    private int rood;
    private int groen;
    private int blauw;
    private String hex;

    public Kleur(String hex) {
        setHex(hex);
    }

    public Kleur(int rood, int groen, int blauw) {
        setRGB(rood, groen, blauw);
    }

    public void setHex(String hex) {
        this.hex = hex;
        hexToRGB();
    }

    public void setRGB(int rood, int groen, int blauw){
        this.rood=rood;
        this.groen=groen;
        this.blauw=blauw;
        rgbToHex();
    }

    private void hexToRGB(){
        this.rood=Integer.parseInt(hex.substring(0, 2), 16);
        this.groen=Integer.parseInt(hex.substring(2, 4), 16);
        this.blauw=Integer.parseInt(hex.substring(4, 6), 16);
    }

    private void rgbToHex(){
        this.hex = '#' + Integer.toHexString(rood) + Integer.toHexString(groen) + Integer.toHexString(blauw);
    }


    public String toString(){
       return String.format("%s (%d, %d, %d)%n", hex, this.rood, this.groen, this.blauw);
    }
}
