package Voorbeelden;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Opdracht7 {
    public static void main(String[] args) {
        // extra geef je geboortedatum in via het toetsenbord voor dagen 1 of 2 cijfers,
        // voor de maanden of 2 cijfers en voor het jaar 4 cijfers
        // je bent ... jaren ... maanden .. dagen zoveel dagen oud.
        // of ... maanden
        Scanner scanner = new Scanner(System.in);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d-M-yyyy");
        System.out.println("Geef geboortedatum in d-M-yyy");
        LocalDate geboorteDatum = LocalDate.parse(scanner.next(), formatter);
        Period levensduur = Period.between(geboorteDatum, LocalDate.now());
        System.out.printf("Ik ben %d jaren %d maanden %d dagen oud%n", levensduur.getYears(), levensduur.getMonths(), levensduur.getDays());
        System.out.printf("Ik ben %d maanden oud %n", ChronoUnit.MONTHS.between(geboorteDatum, LocalDate.now()));
        // extra: het is nog ... maanden en dagen tot de volgende verjaardag Of nog ... dagen
        // druk de volgende verjaardag ook af in de vorm bv. vrijdag 3 februari 23
        LocalDate volgendeVerjaardag = geboorteDatum.withYear(LocalDate.now().getYear());
        if (volgendeVerjaardag.isBefore(LocalDate.now())){
            volgendeVerjaardag = volgendeVerjaardag.plusYears(1);
        }
        Period period = Period.between(LocalDate.now(), volgendeVerjaardag);
        System.out.printf("Het is nog %d maanden en %d dagen tot de volgende verjaardag. Of nog %d", period.getMonths(), period.getDays(), ChronoUnit.DAYS.between(LocalDate.now(), volgendeVerjaardag));
    }
}
