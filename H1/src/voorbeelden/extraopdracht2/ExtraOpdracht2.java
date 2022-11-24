package voorbeelden.extraopdracht2;

import java.util.Scanner;

public class ExtraOpdracht2 {
    public static void main(String[] args) {
        // toon alle veelvouden van 10 die kleiner of gelijk zijn aan 100
        for (int veelvoud = 0; veelvoud <= 100; veelvoud +=10){
            System.out.printf("%-4d", veelvoud);
        }
        System.out.println();
        // Schrijf een programma om volgende afdruk te bekomen
        // R
        // S T
        // U V W
        // X Y Z A
        // grootte moet ingelezen worden. Beginletter moet ook ingelezen worden
        Scanner scanner = new Scanner(System.in);
        System.out.println("Geef de grootte van de driehoek in");
        int grootte = scanner.nextInt();
        System.out.println("Geef de beginletter in");
        char letter = scanner.next().charAt(0);
        for (int i=0; i<=grootte; i++){
            for (int j=1; j<=i; j++){
                System.out.printf("%-3c", letter);
                letter ++;
                if (letter > 'Z'){
                    letter = 'A';
                }
            }
            System.out.println();
        }
        // Toon alle letters van het alfabet (in kleine letters)
        for (char kar = 'a'; kar <= 'z'; kar++){
            System.out.printf("%c", kar);
        }
        System.out.println();
    }
}
