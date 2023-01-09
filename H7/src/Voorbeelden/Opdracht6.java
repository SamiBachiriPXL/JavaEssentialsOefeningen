package Voorbeelden;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Opdracht6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println("Geef een datum volgens patroon dd/MM/yyyy");
        LocalDate datum = LocalDate.parse(scanner.next(), formatter1);
        // afdrukken op 3 verschillende manieren
        // 1ste manier
        System.out.println(datum);
        // 2de manier
        DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        System.out.println(formatter2.format(datum));
        // 3de manier
        System.out.printf("%1$tY-%1$tm-%1$td%n", datum);
        // afdruk bvb vrijdagg 3 februari
        // 1ste manier
        DateTimeFormatter formatter3 = DateTimeFormatter.ofPattern("EEEE d MMMM");
        System.out.println(formatter3.format(datum));
        // 2de manier
        System.out.printf("%1$tA %1$td %1$tB%n", datum);
        System.out.printf("%1$tA %1$te %1$tB%n", datum); // met 1 cijfer
        System.out.printf("%1$tA %2$d %1$tB%n", datum,datum.getDayOfMonth());
    }
}
