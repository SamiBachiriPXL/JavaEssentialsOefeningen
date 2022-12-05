package Voorbeelden;

import java.time.LocalDate;

public class Opdracht11 {
    public static void main(String[] args) {
        // geboortedatum van 2 september 1964
        LocalDate geboortedatum = LocalDate.of(1964, 9, 2);
        System.out.println("A star Keanu Reeves was born on " + geboortedatum);
        System.out.printf("Day %d of the year %d\n", geboortedatum.getDayOfYear(), geboortedatum.getYear());
        System.out.printf("It was on a %s\n", geboortedatum.getDayOfWeek());
        System.out.print("Was it a leap year?");
        if (geboortedatum.isLeapYear()){
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
        // volgende verjaardag
        LocalDate verjaardagDitJaar = geboortedatum.withYear(LocalDate.now().getYear());
        LocalDate volgendeVerjaardag = verjaardagDitJaar;
        if (verjaardagDitJaar.isBefore(LocalDate.now())){
            volgendeVerjaardag = verjaardagDitJaar.plusYears(1);
        }
        System.out.println("De volgende verjaardag " + volgendeVerjaardag);
        // extra alles in het nederlands
        System.out.printf("een beroemdheid Keanu Reeves is geboren op %td/%tm/%ty\n", geboortedatum, geboortedatum, geboortedatum);
        System.out.printf("Dit was %d van het jaar %tY\n",geboortedatum.getDayOfYear(), geboortedatum);
        System.out.printf("Het was op een %tA\n", geboortedatum);
        System.out.print("Was het een schrikkeljaar?");
        if (geboortedatum.isLeapYear()){
            System.out.println("ja");
        } else {
            System.out.println("nee");
        }
        System.out.printf("De volgende verjaardag valt op %1$tA %1$td %1$tB %1$tY\n", volgendeVerjaardag);
    }
}
