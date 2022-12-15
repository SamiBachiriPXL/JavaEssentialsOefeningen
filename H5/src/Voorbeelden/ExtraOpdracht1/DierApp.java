package Voorbeelden.ExtraOpdracht1;

public class DierApp {
    public static void main(String[] args) {
        // opdracht 1
        Dier olifant = new Dier("olifant","herbivoor");
        // opdracht 2
        Hond hond1 = new Hond("tipsi", "poedel");
        Hond hond2 = new Hond("blacky", "straathond");
        Persoon eigenaar = new Persoon("Brepoels", "Hanne");
        hond1.setEigenaar(eigenaar);
        hond2.setEigenaar(hond1.getEigenaar());
        // opdracht 3
        Hond hond3 = new Hond("milkie", "golden retriever", 2002);
        // opdracht 4
        Rund melkkoe = new Rund(true, 2018);
        // opdracht 6
        Rund vleeskoe = new Rund(false, 2018);
        // opdracht 7 illustreer polymorfisme (kan gelijkaardige examenvraag)
        Dier hond4 = new Hond("bob", "pitbull");
        // opdracht 10
        Hond Hond5 = new Hond("krullie", "dalamatiër");
        // opdracht 8
        ((Hond)hond4).setEigenaar(new Persoon("Langkous", "Pipi"));
        Dier [] array = {olifant, hond1, hond2, hond3 , melkkoe, vleeskoe, hond4};
        for (Dier dier: array){
            dier.print();
        }
        System.out.println("Het aantal aangemaakte dieren " + Dier.getAantal());
        System.out.println("Het aantal aangemaakte honden " + Hond.getAantal());
    }
}
