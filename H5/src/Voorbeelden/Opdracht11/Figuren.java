package Voorbeelden.Opdracht11;

public class Figuren {
    public static void main(String[] args) {
        Cirkel cirkel1 = new Cirkel(10, 20, 50);
        Cirkel cirkel2 = new Cirkel(1, 5, 20);
        System.out.printf("Cirkel1 omtrek: %.2f opp: %.2f%n", cirkel1.getOmtrek(), cirkel1.getOppervlakte());
        System.out.printf("Cirkel2 omtrek: %.2f opp: %.2f%n", cirkel2.getOmtrek(), cirkel2.getOppervlakte());
        System.out.println(cirkel1);
        System.out.println(cirkel1.toString());
        Cirkel cirkel3 = new Cirkel(1, 5, 20);
        System.out.println("Zijn cirkel2 en cirkel3 gelijk aan elkaar? " + cirkel2.equals(cirkel3));
        GrafischElement[] vormen = new GrafischElement[5];
        vormen[0] = cirkel1;
        vormen[1] = cirkel2;
        vormen[2] = new Rechthoek(10, 20, 5, 9);
        vormen[3] = new Vierkant(100, 20, 15);
        vormen[4] = new Driehoek(5, 20, 10, 30, 10);
        for (GrafischElement vorm: vormen){
            String omschrijving = bepaalOmschrijving(vorm);
            System.out.printf("Omtrek: %10.0f Oppervlakte: %10.0f %s%n", vorm.getOmtrek(), vorm.getOppervlakte(), omschrijving);
        }
    }

    public static String bepaalOmschrijving(GrafischElement element){
        if (element instanceof Cirkel) return "cirkel";
        if (element instanceof Vierkant) return "vierkant";
        if (element instanceof Rechthoek) return "rechthoek";
        if (element instanceof Driehoek) return "driehoek";
        return null;
    }
}
