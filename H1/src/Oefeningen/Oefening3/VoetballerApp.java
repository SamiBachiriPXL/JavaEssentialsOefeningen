package Oefeningen.Oefening3;

import java.util.Scanner;

public class VoetballerApp {
    public static void main(String[] args) {
        Voetballer speler = new Voetballer();
        Scanner scanner = new Scanner(System.in);

        String naam = scanner.next();
        System.out.printf("Naam: %s\n", naam);
        while (!naam.equals("stop")){
            speler.leeftijd = scanner.nextInt();
            System.out.printf("Leeftijd: %d\n", speler.leeftijd);
            speler.typeSpeler = scanner.next();
            System.out.printf("Positie: %s\n", speler.typeSpeler);
            speler.beoordelingscijfer = scanner.nextInt();
            System.out.printf("Beoordeling: %d\n", speler.beoordelingscijfer);
            speler.aantalDoelpunten = scanner.nextInt();
            System.out.printf("Doelpunten: %d\n", speler.aantalDoelpunten);
            System.out.printf("Prijs: %.2f\n", speler.getPrijs());
            naam = scanner.next();
            System.out.printf("Naam: %s\n", naam);
        }
    }
}
