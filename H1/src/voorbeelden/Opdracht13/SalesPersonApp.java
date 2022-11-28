package voorbeelden.Opdracht13;

import java.util.Scanner;

public class SalesPersonApp {
    public static void main(String[] args) {
        SalesPerson verkoper = new SalesPerson();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Geef je naam in ");
        String naam = scanner.nextLine();
        System.out.println("voor de 12 maandcijfers in op 1 regel");
        for (int i=1; i<=12; i++){
            verkoper.setVerkoopMaand(i, scanner.nextDouble());

        }
        System.out.printf("Verkoper %S heeft op 1 jaar voor %.0f euro verkocht%n", verkoper.getNaam(), verkoper.getTotaalVerkocht());
        System.out.printf("Deze verkoper verkocht gemiddeld per maand voor %.0f euro%n", verkoper.getGemiddeldVerkocht());
        // extra: maak een array van 3 verkopers aan. doe voor deze 3 verkopers hetzelfde als hierboven

        SalesPerson[] verkopers = new SalesPerson[3]; // Je maakt plaats voor 3 verkopers maar deze worden hier niet aangemaakt
        for (int j=0; j < verkopers.length; j++){
            verkopers[j] = new SalesPerson();
            System.out.println("Geef je naam in ");
            naam = scanner.nextLine();
            verkopers[j].setNaam(naam);
            System.out.println("voor de 12 maandcijfers in op 1 regel");
            for (int i=1; i<=12; i++){
                verkopers[j].setVerkoopMaand(i, scanner.nextDouble());
            }
            System.out.printf("Verkoper %S heeft op 1 jaar voor %.0f euro verkocht%n", verkopers[j].getNaam(), verkopers[j].getTotaalVerkocht());
            System.out.printf("Deze verkoper verkocht gemiddeld per maand voor %.0f euro%n", verkopers[j].getGemiddeldVerkocht());
        }
    }
}
