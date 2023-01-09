package Oefeningen.Oef1;

import java.util.ArrayList;

public class MuntApp {
    public static void main(String[] args) {
        double bedrag = 1.25;
        double bedragInCent = bedrag * 100;
        int[] aantalMunten = {0, 0, 0, 0, 0, 0, 0, 0};

        while(bedragInCent > 0){
            if (bedragInCent > Munt.TWEE_EURO.getWaarde()){
                bedragInCent -= Munt.TWEE_EURO.getWaarde();
                aantalMunten[7]++;
            } else if (bedragInCent > Munt.EEN_EURO.getWaarde()) {
                bedragInCent -= Munt.EEN_EURO.getWaarde();
                aantalMunten[6]++;
            }else if (bedragInCent > Munt.VIJGTIG.getWaarde()) {
                bedragInCent -= Munt.VIJGTIG.getWaarde();
                aantalMunten[5]++;
            }else if (bedragInCent > Munt.TWINTIG.getWaarde()) {
                bedragInCent -= Munt.TWINTIG.getWaarde();
                aantalMunten[4]++;
            }else if (bedragInCent > Munt.TIEN.getWaarde()) {
                bedragInCent -= Munt.TIEN.getWaarde();
                aantalMunten[3]++;
            }else if (bedragInCent > Munt.VIJF.getWaarde()) {
                bedragInCent -= Munt.VIJF.getWaarde();
                aantalMunten[2]++;
            }else if (bedragInCent > Munt.TWEE.getWaarde()) {
                bedragInCent -= Munt.TWEE.getWaarde();
                aantalMunten[1]++;
            } else{
                bedragInCent -= Munt.EEN.getWaarde();
                aantalMunten[0]++;
            }
        }

        for (int aantal: aantalMunten){
            System.out.printf("Aantal munten: %d%n", aantal);
        }
    }
}
