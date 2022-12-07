package Oefeningen.Oefening2;

import java.util.Scanner;

public class BankrekeningApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Bankrekening bankrekening = new Bankrekening(scanner.next(), scanner.next(), scanner.nextDouble(), scanner.nextDouble());
        double bedrag;
        while (bankrekening.getSaldo() !=0){
            int keuze = scanner.nextInt();
            if (keuze == 1){
                System.out.println("Stort bedrag");
                bedrag = scanner.nextDouble();
                bankrekening.stort(bedrag);
            } else{
                System.out.println("neemt bedrag op");
                bedrag = scanner.nextDouble();
                bankrekening.neemOp(bedrag);
            }
        }
    }
}
