package Oefeningen.Oefening2;

public class Bankrekening {
    private String rekeningNummer = "geen";
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

    }

    public Bankrekening(Bankrekening bankrekening){
        this(bankrekening.rekeningNummer, bankrekening.naam, bankrekening.saldo, bankrekening.rentepercentage);
    }

    public void notNegative(double saldo){
        if (saldo < 0){
            saldo=0;
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
        if (valideerRekening()){
            saldo+=bedrag;
            System.out.printf("Na storting van %.2f euro\n", bedrag);
            check();
        }
    }

    public void neemOp(double bedrag){
        if (valideerRekening()){
            if (bedrag > saldo){
                System.out.printf("Het saldo is %.2f en je wil %.2f euro\n", saldo, bedrag);
                System.out.printf("U mag enkel %.2f euro opnemen\n", saldo);
                check();

            } else if (saldo == 0) {
                System.out.println("U kan geen geld opnemen");
            } else {
                saldo -=bedrag;
                System.out.printf("Saldo is nu %.2f", saldo);
            }
        }
    }

    public void doeVerrichting(double bedrag){
        if (valideerRekening()){
            if (bedrag < 0){
                neemOp(bedrag);
            } else{
                stort(bedrag);
            }
        }
    }

    public void schrijfRenteBij(){
        double rente = (saldo * rentepercentage)/100;
        System.out.printf("Rente wordt bijgeschreven voor %.2f euro\n", rente);
        this.saldo+=rente;
        check();
    }

    public boolean valideerRekening(){
        if (!rekeningNummer.equals("geen") && !naam.equals("onbekend")){
            return true;
        } else {
            System.out.println("error");
            return false;
        }
    }

    public void print(){
        System.out.printf("Saldo op spaarrekening %s op naam van %s bedraagt %.2f\n", rekeningNummer, naam, saldo);
    }

    public void check(){
        print();
    }
}
