package Oefeningen.Oefening8;

public class Lift {
    private int aantalVerdiepingen;
    private int verdieping;
    private int maxAantal;
    private int hoeveelInLift;

    public void setAantalVerdiepingen(int aantalVerdiepingen) {
        this.aantalVerdiepingen = aantalVerdiepingen;
    }

    public void setVerdieping(int verdieping) {
        this.verdieping = verdieping;
    }

    public void setMaxAantal(int maxAantal) {
        this.maxAantal = maxAantal;
    }


    public void setHoeveelInLift(int hoeveelInLift) {
        this.hoeveelInLift = hoeveelInLift;
    }

    public void betreed(int aantalPersonen){
        if (hoeveelInLift + aantalPersonen > maxAantal) {
            hoeveelInLift = maxAantal;
        } else {
            hoeveelInLift += aantalPersonen;
        }
    }

    public void verlaat(int aantalPersonen){
        if (hoeveelInLift - aantalPersonen < 0){
            hoeveelInLift=0;
        } else{
            hoeveelInLift-=aantalPersonen;
        }
    }

    public void gaNaar(int naarVerdieping){
        if (0 < naarVerdieping || naarVerdieping< aantalVerdiepingen) {
            if (naarVerdieping < verdieping) {
                gaNaarBeneden(naarVerdieping);
            } else if (naarVerdieping == verdieping) {
                System.out.println("Dit is de huidige verdieping.");
            } else {
                gaNaarBoven(naarVerdieping);
            }
        }
    }

    private void gaNaarBeneden(int naarVerdieping){
        for (int i=verdieping; i>=naarVerdieping; i--){
            System.out.println("---");
            System.out.println("|" + i + "|");
            System.out.println("---");
        }
        verdieping=naarVerdieping;
    }

    private void gaNaarBoven(int naarVerdieping){
        for (int i=verdieping; i<=naarVerdieping; i++){
            System.out.println("---");
            System.out.println("|" + i + "|");
            System.out.println("---");
        }
        verdieping=naarVerdieping;
    }
}
