package Voorbeelden.ExtraoOpdracht3;


public class DierApp {
    public static void main(String[] args) {
        // opdracht 1
//        Dier olifant = new Dier("olifant","herbivoor");
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
        Dier[] array = {hond1, hond2, hond3 , melkkoe, vleeskoe, hond4};
        int tel=0;
        for (Dier dier: array){
            // opdract 3.7
            if (dier instanceof Hond){
                if ((((Hond) dier).getLeeftijd())>5){
                    tel++;
                    ((Hond) dier).setNaam(((Hond) dier).getNaam().toUpperCase());
                }
            }
        }
        System.out.println("Het aantal aangemaakte dieren " + Dier.getAantal());
        System.out.println("Het aantal aangemaakte honden " + Hond.getAantal());
        // opdracht 3.5
        System.out.println("Hebben hond1 en hond2 dezelfde eigenaar? " + hond1.getEigenaar().equals(hond2.getEigenaar()));
    }
}
