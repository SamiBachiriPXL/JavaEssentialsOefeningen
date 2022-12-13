package Oefeningen.Oef4;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class ScoutsKalenderApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Activiteit> lijst = new ArrayList<>();
        System.out.println("Geef het jaar in");
        int jaar = scanner.nextInt();

        System.out.println("Geef het maand in");
        int maand = scanner.nextInt();

        System.out.println("Geef het dag in");
        int dag = scanner.nextInt();

        int count=1;
        while (dag!=0 || count==10){
            System.out.println("Geef het activiteit in");
            String naam = scanner.next();

            count++;

            LocalDate date = LocalDate.of(jaar, maand, dag);
            lijst.add(new Activiteit(naam, date));

            System.out.println("Geef het dag in");
            dag = scanner.nextInt();

        }
        System.out.printf("*** Kalender voor %S %d***\n", lijst.get(0).getDatum().getMonth(), lijst.get(0).getDatum().getYear());
        for (Activiteit activiteit: lijst){
            System.out.println(activiteit.toString());
        }
    }
}
