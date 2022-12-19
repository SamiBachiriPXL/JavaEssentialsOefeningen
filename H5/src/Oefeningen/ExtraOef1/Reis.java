package Oefeningen.ExtraOef1;

public abstract class Reis {
    private String bestemming;
    private double prijs;

    private static final double minimumPrijs = 5;

    public Reis(String bestemming) {
        this(bestemming, minimumPrijs);
    }

    public Reis(String bestemming, double prijs) {
        this.bestemming = bestemming;
        this.prijs = prijs;
    }

    public String getBestemming() {
        return bestemming;
    }

    public void setBestemming(String bestemming) {
        if (Character.isDigit(bestemming.charAt(0))){
            bestemming=bestemming.substring(1);
        }
        this.bestemming=bestemming;
    }

    public double getPrijs() {
        return prijs;
    }

    public void setPrijs(double prijs) {
        this.prijs = prijs;
    }

    public double getMinimumPrijs(){
        return minimumPrijs;
    }

    public String toString(){
        return "Reis met bestemming " + bestemming + "kost " +prijs+ " " + "euro.";
    }
}
