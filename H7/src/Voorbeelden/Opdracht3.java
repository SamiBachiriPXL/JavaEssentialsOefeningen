package Voorbeelden;

import java.time.Duration;
import java.time.Instant;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Opdracht3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Geef je naam in");
        Instant voor = Instant.now();
        String naam = scanner.nextLine();
        Instant na = Instant.now();
        System.out.printf("Je deed er %.2f seconden over%n", (na.toEpochMilli() - voor.toEpochMilli())/1000.0);
        // alternatieve manieren
        // 1ste manieren
        System.out.printf("Je deed er %.2f seconden over%n", ChronoUnit.MILLIS.between(voor, na)/100.0);
        // 2de manier
        Duration duur = Duration.between(voor, na);
        System.out.printf("Je deed er %.2f seconden over%n", duur.toMillis()/1000.0);
    }
}
