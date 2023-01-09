package Voorbeelden;

import java.time.DayOfWeek;
import java.util.Scanner;

public class Opdracht4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Geef weekdag");
        DayOfWeek startdag = DayOfWeek.of(scanner.nextInt());
        System.out.printf("Resultaat: %s%n", startdag);
        System.out.println("Hoeveel dagen erbij tellen?");
        int dagen = scanner.nextInt();
        DayOfWeek einddag = startdag.plus(dagen);
        System.out.printf("Resultaat: %s%n", einddag);
    }
}
