package Voorbeelden;

import java.util.Scanner;

public class Opdracht1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lees een geheel getal in");
        int x = scanner.nextInt();
        int resultaat = (int) Math.pow(x, 3);
        System.out.println("dit getal tot de 3de macht = " + resultaat);
    }
}
