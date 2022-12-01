package Oefeningen.Oefening2;

public class Bankrekening {
    private String rekeningNummer= "geen";
    private String naam = "onbekend";
    private double saldo = 0;
    private double rentepercentage = 1.2;

    public Bankrekening(String rekeningNummer, String naam, double saldo, double rentepercentage) {
        this.rekeningNummer = rekeningNummer;
        this.naam = naam;
        this.saldo = saldo;
        this.rentepercentage = rentepercentage;
    }

    public Bankrekening() {
        this.rekeningNummer = "geen";
        this.naam = "onbekend";
        this.saldo = 0;
        this.rentepercentage = 1.2;
    }

    public void notNegative(double getal){
        if (getal < 0){
            getal=0;
        }
    }

    public void setSaldo(double saldo) {
        notNegative(saldo);
        this.saldo = saldo;
    }

    public void setRentepercentage(double rentepercentage) {
        notNegative(rentepercentage);
        this.rentepercentage = rentepercentage;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public void setRekeningNummer(String rekeningNummer) {
        this.rekeningNummer = rekeningNummer;
    }

    public double getSaldo() {
        return saldo;
    }

    public void stort(double bedrag){
        saldo+=bedrag;
    }

    public void neemOp(double bedrag){
        if (bedrag > saldo){
            System.out.printf("Het saldo is %.2f en je wil %.2f euro\n", saldo, bedrag);
            System.out.printf("U mag enkel %.2f euro opnemen", saldo);

        } else if (saldo == 0) {
            System.out.println("U kan geen geld opnemen");
        }
    }
}
