package Voorbeelden.ExtraOpdracht2;

public class Bewerkingen { // utility klasse die uitsluitend hulpmethoden bevat. Het is niet de bedoeling dat hier objecten van worden gebruikt
    public static int telOp(int[] array){
        int som = 0;
        for (int getal : array){
            som += getal;
        }
        return som;
    }

    public static int trekAf(int[] array){
        int som = 0;
        for (int getal : array){
            som -= getal;
        }
        return som;
    }

    public static int vermenigvuldig(int[] array){
        int product = 1;
        for (int getal : array){
            product *= getal;
        }
        return product;
    }

}
