package Voorbeelden;

import java.util.Scanner;

public class Opdracht2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Geef de straal in");
        double straal = scanner.nextDouble();
        System.out.println("Geef de hoogte in");
        double hoogte = scanner.nextDouble();
        double volume = Math.PI * straal * straal * hoogte;
        System.out.println("Het volume in cm^3 " + volume);
        double volumeAfgerond2cijfers = Math.round(volume * 100)/100.0;
        System.out.println("Afgerond op 2 cijfers na de komma " + volumeAfgerond2cijfers);
    }
}
