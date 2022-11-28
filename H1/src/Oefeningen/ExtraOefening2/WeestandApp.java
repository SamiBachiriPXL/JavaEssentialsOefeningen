package Oefeningen.ExtraOefening2;

import java.util.Scanner;

public class WeestandApp {
    public static void main(String[] args) {
        Weerstand weerstand = new Weerstand();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Geef band:");
        char band1 = scanner.next().charAt(0);
        weerstand.setBand1(band1);
        System.out.println("Geef band:");
        char band2 = scanner.next().charAt(0);
        weerstand.setBand2(band2);
        System.out.println("Geef band:");
        char band3 = scanner.next().charAt(0);
        weerstand.setBand3(band3);

        System.out.println(weerstand.getKleur());
        System.out.println("Weerstand waarde: " + weerstand.getWeerstandswaarde());
    }
}
