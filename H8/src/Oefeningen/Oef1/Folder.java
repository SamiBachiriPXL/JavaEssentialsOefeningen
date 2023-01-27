package Oefeningen.Oef1;

import java.util.ArrayList;

public class Folder implements Uitvoerbaar{
    private String naam;
    private ArrayList<Bestand> bestanden = new ArrayList<>();

    public Folder(String naam) {
        this.naam = naam;
    }

    public void voegBestandenToe(Bestand[] bestand){
        for (Bestand bes: bestand){
            bestanden.add(bes);
        }
    }

    @Override
    public void voerUit() {
        System.out.println(naam);
        for (Bestand bestand: bestanden){
            System.out.println(bestand.toString());
        }
    }
}