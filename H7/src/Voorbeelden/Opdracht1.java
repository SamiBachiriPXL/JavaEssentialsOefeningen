package Voorbeelden;

import java.util.ArrayList;
import java.util.Scanner;

public class Opdracht1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Geef 2 gehele getallen in");
        String getal1 = scanner.next();
        String getal2 = scanner.next();
        // getal1 -> integer
        Integer objectGetal1 = Integer.parseInt(getal1); // auto boxing
        // alternatief
        Integer objectGetal1bis = Integer.valueOf(getal1);
        Integer intGetal2 = Integer.parseInt(getal2);
        objectGetal1 = objectGetal1 + intGetal2; // auto unboxing, 2 int optellen, auto boxing
        System.out.println(objectGetal1);
        // aantal bits om int voor te stellen
        System.out.println(Integer.SIZE);
        // aantal bytes om een int voor te stellen
        System.out.println(Integer.BYTES);
        // extra maak een arrayList met uitsluited gehele getallen.
        // vermeerder de eerste waarde met 5
        ArrayList<Integer> objectGetallen = new ArrayList<>();
        objectGetallen.add(10);
        objectGetallen.add(5);
        objectGetallen.add(6);
        objectGetallen.set(0, objectGetallen.get(0) + 5);
        System.out.println(objectGetallen.get(0)); // auto unboxing, int optellen, auto boxing
        // opmerking niet oké bij rekenintensieve toepassingen!!!!!
    }
}
