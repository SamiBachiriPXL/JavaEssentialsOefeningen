package Opdracht;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class VormApp {
    public static void main(String[] args) {
        ArrayList<GrafischElement> lijst = new ArrayList<>();
        lijst.add(new Cirkel(2, 3, 5));
        lijst.add(new Rechthoek(10, 20, 5, 10));
        lijst.add(new Driehoek(12, 3, 10, 30, 15));
        lijst.add(new Vierkant(-10,  -5, 15));
        for (GrafischElement el: lijst){
            System.out.println(el);
            System.out.printf("%S oppervlakte %.2f%n", bepaalOmschrijving(el), el.getOppervlakte());
            System.out.println("Na herschaling");
            el.herschaal(2);
            System.out.println(el);
            System.out.printf("%S oppervlakte %.2f%n", bepaalOmschrijving(el), el.getOppervlakte());
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
