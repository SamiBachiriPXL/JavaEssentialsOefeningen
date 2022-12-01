package Voorbeelden.Opdracht3;

public class KlasgroepApp {
    public static void main(String[] args) {
        System.out.println("het maximaal toegelaten studenten per klas = " + Klasgroep.MAX);
        Klasgroep tina = new Klasgroep("1TINa", 29);
        Klasgroep tinb = new Klasgroep("1TINb", 29);
        Klasgroep tinc = new Klasgroep("1TINc", 25);
        Klasgroep tink = new Klasgroep();
        Klasgroep[] klassen = {tina, tinb, tinc, tink};
        for (Klasgroep klas: klassen){
            System.out.println(klas.getNaam() + ": " + klas.getAantalStudenten());
        }
    }
}
