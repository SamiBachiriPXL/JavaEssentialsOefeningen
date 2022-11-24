package Oefeningen.oef3;

public class Voetballer {
    public String naam;
    public int leeftijd;
    public int beoordelingscijfer;
    public String typeSpeler;
    public int aantalDoelpunten;


    public double getPrijs(int leeftijd, int beoordelingscijfer, String position, int aantalDoelpunten){
        this.typeSpeler=position;
        double prijs = 0;
        if (typeSpeler != null){
            if (typeSpeler.equals("aanvaller")){
                prijs+=30000;
                if (leeftijd < 25){
                    prijs*=1.1;
                    if (aantalDoelpunten <= 5){
                        int toegevoegdePrijs = 10000 * aantalDoelpunten;
                        prijs+=toegevoegdePrijs;
                    } else{
                        int toegevoegdePrijs = 10000*5;
                        toegevoegdePrijs+=(20000 * (aantalDoelpunten-5));
                        prijs+=toegevoegdePrijs;
                    }
                } else if (leeftijd > 30) {
                    prijs*=0.95;
                    if (aantalDoelpunten <= 5){
                        int toegevoegdePrijs = 10000 * aantalDoelpunten;
                        prijs+=toegevoegdePrijs;
                    } else{
                        int toegevoegdePrijs = 10000*5;
                        toegevoegdePrijs+=(20000 * (aantalDoelpunten-5));
                        prijs+=toegevoegdePrijs;
                    }
                } else {
                    if (aantalDoelpunten <= 5){
                        int toegevoegdePrijs = 10000 * aantalDoelpunten;
                        prijs+=toegevoegdePrijs;
                    } else{
                        double toegevoegdePrijs = 10000*5;
                        toegevoegdePrijs+=(20000 * (aantalDoelpunten-5));
                        prijs+=toegevoegdePrijs;
                    }
                }
            } else if (typeSpeler.equals("middenvelder")) {
                prijs+=28000;
                if (leeftijd < 25){
                    prijs*=1.1;
                    prijs +=(10000*beoordelingscijfer);
                } else if (leeftijd > 30) {
                    prijs*=0.95;
                    prijs +=(10000*beoordelingscijfer);
                } else {
                    prijs +=(10000*beoordelingscijfer);
                }
            } else if (typeSpeler.equals("verdediger")) {
                prijs+=29000;
                if (leeftijd < 25){
                    prijs*=1.1;

                } else if (leeftijd > 30) {
                    prijs*=0.95;
                    prijs +=(10000*beoordelingscijfer);
                } else {
                    prijs +=(10000*beoordelingscijfer);
                }
            } else if (typeSpeler.equals("doelman")) {
                prijs+=25000;
                if (leeftijd < 25){
                    prijs*=1.1;
                    prijs +=(10000*beoordelingscijfer);
                    if (aantalDoelpunten>20){
                        prijs-=9000*(aantalDoelpunten-20);
                    }
                } else if (leeftijd > 30) {
                    prijs*=0.95;
                    prijs +=(10000*beoordelingscijfer);
                } else {
                    prijs +=(10000*beoordelingscijfer);
                }
            }
        }
        return prijs;
    }
}
