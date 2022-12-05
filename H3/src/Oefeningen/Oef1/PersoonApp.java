package Oefeningen.Oef1;

import java.util.Scanner;

public class PersoonApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Persoon persoon = new Persoon("Sami", "Bachiri");
//        Persoon persoon = new Persoon();
//        persoon.setVoornaam("Sami");
//        persoon.setNaam("Bachiri");
//        persoon.setGeboortejaar(2003);
//        persoon.setLengte(1.76);
//        persoon.setGewicht(62);
        System.out.println(persoon.allToString());
        System.out.println("BMI is " + persoon.berekenBmi());
        System.out.println("Persoon is " + persoon.getLeeftijd());
        System.out.println("Persoon was " + persoon.getLengte());
        persoon.groei1();
        System.out.println("Persoon is " + persoon.getLengte());
        persoon.groei2(scanner.nextDouble());
        System.out.println("Persoon is " + persoon.getLengte());
//        Persoon persoon2 = new Persoon(persoon);
    }
}
