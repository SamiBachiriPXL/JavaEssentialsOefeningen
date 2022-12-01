package Voorbeelden.Auto;

import Voorbeelden.Auto.Auto;

public class AutoApp {
    public static void main(String[] args) {
        System.out.println("Een eerste auto wordt aangemaakt");
//        Auto auto= new Auto(); //aanmaken van een object=oproepen van een methode die dit object aanmaakt en instantie eigenschappen een default waarde geeft = default constructor
//        auto.setKleur("Rood");
//        auto.setMerk("Volkswagen");
//        auto.setKilometerstand(123456);
//        auto.setAantalDeuren(4);

//        System.out.println("Deze auto is van het merk " + auto.getMerk() + " in de kleur " + auto.getKleur());
//        System.out.println("Het is een wagen met " + auto.getAantalDeuren() + " deuren.");
//        System.out.println("Kilometerstand bedraagt " + auto.getKilometerstand() + " kilometers.");
        // extra bovenstaande realiseren door gebruik te maken van een methoden in de klasse Auto
//        auto.drukGegevens();
//        System.out.println(auto); // drukt geheugenadres(referentie) af waar dit object zich in het intern geheugen bevindt

//        int[] kilometers = {678, 789, 812, 965, 123};
//        auto.rijden(kilometers);
//        System.out.printf("De kilometerafstand is %,d%n", auto.getKilometerstand());

        Auto auto1 = new Auto("Citroën", "wit", 3);
        auto1.drukGegevens();
        Auto auto2 = new Auto("fort", "grijs", 4);
        auto1.drukGegevens();
        Auto auto3 = new Auto(auto2);
        auto1.drukGegevens();
        // gegevens van alle auto's afdrukken mbv lus
        Auto[] autos = {auto1, auto2, auto3};
        for (Auto a: autos){
            a.drukGegevens();
        }
    }
}
