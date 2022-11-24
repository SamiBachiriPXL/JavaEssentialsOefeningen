package Oefeningen.oef3;

import java.util.Scanner;

public class VoetballerApp {
    public static void main(String[] args) {
        Voetballer speler = new Voetballer();
        Scanner scanner = new Scanner(System.in);

        String naam = scanner.next();
        System.out.printf("Naam: %s\n", naam);
        while (!naam.equals("stop")){
            int leeftijd = scanner.nextInt();
            System.out.printf("Leeftijd: %d\n", leeftijd);
            String position = scanner.next();
            System.out.printf("Positie: %s\n", position);
            int beoordelingscijfer = scanner.nextInt();
            System.out.printf("Beoordeling: %d\n", beoordelingscijfer);
            int aantalDoelpunten = scanner.nextInt();
            System.out.printf("Doelpunten: %d\n", aantalDoelpunten);
            double prijs = speler.getPrijs(leeftijd, beoordelingscijfer, position, aantalDoelpunten);
            System.out.printf("Prijs: %.2f\n", prijs);
        }
    }
}
