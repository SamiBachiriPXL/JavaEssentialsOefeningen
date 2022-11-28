package Oefeningen.ExtraOefening2;

public class Weerstand {
    private char band1;
    private char band2;
    private char band3;

    private String[] kleuren = {"zwart", "bruin", "rood", "oranje", "geel", "groen", "blauw", "violet", "grijs", "wit"};
    private int[] waardes = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
    private char[] letters = {'Z', 'b', 'R', 'O', 'g', 'G', 'B', 'V', 'L', 'W'};

    public void setBand1(char band1) {
        this.band1 = band1;
    }

    public void setBand2(char band2) {
        this.band2 = band2;
    }

    public void setBand3(char band3) {
        this.band3 = band3;
    }

    public int getWeerstandswaarde(){
        int waarde1 = vindWaarde(band1);
        int waarde2 = vindWaarde(band2);
        int waarde3 = vindWaarde(band3);

        int macht = 10;
        if (waarde3==0){
            macht = 0;
        }
        for (int i=0; i<=waarde3; i++){
            macht*=10;
        }
        return (10 * waarde1 + waarde2) * macht;
    }

    public String getKleur(){
        return vindKleur(band1) + " " + vindKleur(band2) + " " + vindKleur(band3);
    }

    private String vindKleur(char band) {
        for (int i=0; i<letters.length; i++){
            if (band==letters[i]){
                return kleuren[i];
            }
        }
        return "(kleur niet gevonden)";
    }

    private int vindWaarde(char band) {
        for (int i=0; i<letters.length; i++){
            if (band==letters[i]){
                return waardes[i];
            }
        }
        return 0;
    }
}
