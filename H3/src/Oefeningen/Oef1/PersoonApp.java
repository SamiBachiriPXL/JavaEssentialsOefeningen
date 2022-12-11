package Oefeningen.Oef1;

import java.time.LocalDate;
import java.util.Scanner;

public class PersoonApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Persoon persoon = new Persoon("Sami", "Bachiri");

        System.out.println("geboortedatum:");
        int jaar = scanner.nextInt();
        int maand = scanner.nextInt();
        int dag = scanner.nextInt();

        LocalDate geboortedatum = LocalDate.of(jaar, maand, dag);
        persoon.setGeboortedatum(geboortedatum);
        System.out.println("Geef gewicht van persoon:");
        double gewicht = scanner.nextDouble();
        if (gewicht < 40 || gewicht >100){
            gewicht = scanner.nextDouble();
        }
        persoon.setGewicht(gewicht);
        System.out.println("Geef lengte van persoon:");
        double lengte = scanner.nextDouble();
        if (lengte < 1.57 || lengte >2.10){
            lengte = scanner.nextDouble();
        }
        persoon.setLengte(lengte);
        System.out.println(persoon.allToString());
        System.out.println("BMI is " + persoon.berekenBmi());
        System.out.println("Persoon is " + persoon.getLeeftijd());
        System.out.println("Persoon was " + persoon.getLengte());
        persoon.groei1();
        System.out.println("Persoon is " + persoon.getLengte());
        System.out.println("Groei2:");
        persoon.groei2(scanner.nextDouble());
        System.out.println("Persoon is " + persoon.getLengte());
        String afgekort = persoon.geefNaamAfgekort();
        System.out.println("Afgekorte naam: " + afgekort);
        System.out.println("Geef een getal:");
        int getal = scanner.nextInt();
        if (getal<1 || getal>20){
            getal = scanner.nextInt();
        }
        String encrypt = persoon.encrypteerNaam(getal, afgekort);
        System.out.println("Geëncrypteerde naam: " + encrypt);
    }
}
