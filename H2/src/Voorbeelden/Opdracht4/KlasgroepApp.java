package Voorbeelden.Opdracht4;


public class KlasgroepApp {
    public static void main(String[] args) {
        System.out.println("het maximaal toegelaten studenten per klas = " + Voorbeelden.Opdracht3.Klasgroep.MAX);
        Voorbeelden.Opdracht3.Klasgroep tina = new Voorbeelden.Opdracht3.Klasgroep("1TINa", 29);
        Voorbeelden.Opdracht3.Klasgroep tinb = new Voorbeelden.Opdracht3.Klasgroep("1TINb", 29);
        Voorbeelden.Opdracht3.Klasgroep tinc = new Voorbeelden.Opdracht3.Klasgroep("1TINc", 25);
        Voorbeelden.Opdracht3.Klasgroep tink = new Voorbeelden.Opdracht3.Klasgroep();
        Voorbeelden.Opdracht3.Klasgroep[] klassen = {tina, tinb, tinc, tink};
        System.out.printf("Er zijn %d klasgroepen aangemaakt\n", Klasgroep.getTeller());
        System.out.printf("Het totaal aantal sutdenten i 1TIN %d%n", Klasgroep.getTotaalAantalStudenten());
        tinb.setAantalStudenten(tinb.getAantalStudenten() + 1); // opdracht 11

        for (Klasgroep klas: klassen){
            System.out.println(klas.getNaam() + ": " + klas.getAantalStudenten());
        }
    }
}
