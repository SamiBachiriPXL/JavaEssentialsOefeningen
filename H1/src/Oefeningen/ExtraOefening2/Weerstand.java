package Oefeningen.ExtraOefening2;

public class Weerstand {
    private char band1;
    private char band2;
    private char band3;

    public void setBand1(char band1) {
        this.band1 = band1;
    }

    public void setBand2(char band2) {
        this.band2 = band2;
    }

    public void setBand3(char band3) {
        this.band3 = band3;
    }

    public char getBand1() {
        return band1;
    }

    public char getBand2() {
        return band2;
    }

    public char getBand3() {
        return band3;
    }

    public int getWeerstandswaarde(int getal1, int getal2, int getal3){
        int macht = 10;
        if (getal3==0){
            macht = 0;
        }
        for (int i=0; i<=getal3; i++){
            macht*=10;
        }
        return (10 * getal1 + getal2) * macht;
    }

//    public String getKleur(){
//
//    }
}
