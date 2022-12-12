package Oefeningen.Oef1;

import java.util.Random;

public class Band {
    private String naam;
    private Muzikant[] leden;

    public Band(String naam, Muzikant[] leden) {
        this.naam = naam;
        this.leden = leden;
    }

    public void speel(int lengte){
        System.out.println(naam + "in concert!");
        Random rand = new Random();

        for (int i=0; i<lengte; i++){
            int value = rand.nextInt(leden.length);
            leden[value].speel();
        }

    }

    public String toString(){
        StringBuilder string = new StringBuilder();
        string.append(naam).append("\n");
        for (Muzikant lid: leden){
            string.append(lid.toString()).append("\n");
        }
        return string.toString();
    }
}
