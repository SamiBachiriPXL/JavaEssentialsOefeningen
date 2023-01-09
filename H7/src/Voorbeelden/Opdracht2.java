package Voorbeelden;

import java.math.BigInteger;
import java.util.Scanner;

public class Opdracht2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Geef een geheel getal in ");
        int getal = scanner.nextInt();
        int faculteit = berekenFaculteit(getal);
        System.out.println(faculteit);
        BigInteger faculteitBig = berekenFaculteitExact(getal);
        System.out.println(faculteitBig);
    }
    // int oké tem 12
    // long oké tem 20

    public static int berekenFaculteit(int getal){
        int product = 1;
        for (int i = 2; i<=getal; i++){
            product*=i;
        }
        return product;
    }

    public static BigInteger berekenFaculteitExact(int getal){
        BigInteger product = BigInteger.ONE;
        for (int i = 2; i<=getal; i++){
            product= product.multiply(BigInteger.valueOf(i));
            // of
//            product = product.multiply(new BigInteger(i + ""));
        }
        return product;
    }
}
