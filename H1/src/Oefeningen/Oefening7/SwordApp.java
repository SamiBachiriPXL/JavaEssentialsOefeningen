package Oefeningen.Oefening7;

import java.util.Scanner;

public class SwordApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Sword[] swords = new Sword[3];
        for (int i=0; i< swords.length; i++){
            swords[i] = new Sword();
            System.out.println("Give material:");
            String material = scanner.next();
            scanner.nextLine();
            swords[i].setMaterial(material);
            System.out.println("Give durability:");
            int durability = scanner.nextInt();
            scanner.nextLine();
            swords[i].setDurability(durability);
        }

        String mostDurable ="";
        int most = 0;
        for (int i=0; i<swords.length; i++){
            if (swords[i].getDurability() > most){
                most=swords[i].getDurability();
                mostDurable=swords[i].getMaterial();
            }
        }
        System.out.println("Most durable sword is of " + mostDurable);

        System.out.println();

        System.out.println("| Materiaal|  Duurzaamheid|");
        for (int i=0; i< swords.length; i++){
            System.out.printf("|%10s|%14d|%n", swords[i].getMaterial(), swords[i].getDurability());
        }
    }
}
