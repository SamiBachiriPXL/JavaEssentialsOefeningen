package voorbeelden.opdracht10;

import java.util.Scanner;

public class BankAccountApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BankAccount bankAccount = new BankAccount();
        bankAccount.setCode("BE");
        bankAccount.setControlecijfers(67);
        bankAccount.setNummer(123456789012L);
        System.out.println("Rekeningnummer " + bankAccount.getAccount());
        System.out.println("Geldig nummer? " + bankAccount.isGeldig());
        System.out.println("Geef het startbedrag:");
        double startBedrag = scanner.nextDouble();
        bankAccount.setBedrag(startBedrag);
        System.out.println("Wil je geld afhalen? (J/N)");
        String antwoord = scanner.next();
        while (antwoord.equals("J") && bankAccount.getBedrag() > 0){
            System.out.printf("Hoeveel geld wil je afhalen? (max. %.2f)\n", bankAccount.getBedrag());
            double bedrag = scanner.nextDouble();
            bankAccount.haalaf(bedrag);
            System.out.println("Wil je geld afhalen? (J/N)");
            antwoord = scanner.next();

        }
        System.out.printf("Er staat nog %.2f euro op de rekening \n", bankAccount.getBedrag());
    }
}
