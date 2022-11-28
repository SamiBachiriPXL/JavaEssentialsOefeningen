package Oefeningen.Oefening8;

import java.util.Scanner;

public class LiftApp {
    public static void main(String[] args) {
        Lift lift = new Lift();
        Scanner scanner = new Scanner(System.in);
        lift.setHoeveelInLift(0);
        lift.setMaxAantal(5);
        lift.setVerdieping(0);
        lift.setAantalVerdiepingen(10);
        int keuze = 0;
        int nummer;

        while (keuze !=4){
            System.out.println("1. Ga naar verdieping ...");
            System.out.println("2. Betreed de lift...");
            System.out.println("3. Verlaat de lift...");
            System.out.println("4. Stoppen");
            keuze = scanner.nextInt();
            if (keuze == 1){
                System.out.println("Kies een verdieping:");
                nummer=scanner.nextInt();
                lift.gaNaar(nummer);
            } else if (keuze == 2) {
                System.out.println("Aantal personen:");
                nummer= scanner.nextInt();
                lift.betreed(nummer);
            } else if (keuze == 3) {
                System.out.println("Aantal personen:");
                nummer= scanner.nextInt();
                lift.verlaat(nummer);
            }
        }
    }
}
