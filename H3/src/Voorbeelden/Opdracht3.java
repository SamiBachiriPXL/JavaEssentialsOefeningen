package Voorbeelden;

import java.util.Random;

public class Opdracht3 {
    public static void main(String[] args) {
        // genereer een geheel getal
        Random random = new Random();
        // extra om ervoor te zorgen dat alle studenten dezelfde getallen krijgen
        random.setSeed(1256); // 1256 willekeurig gekozen
        int x = random.nextInt();
        System.out.println(x);
        // genereer 20 gehele getallen >=0 en <=10
        for (int i = 0 ; i<20 ; i++){
            System.out.printf("%-3d", random.nextInt(11));
        }
        System.out.println();
        // genereer 10 gehele getallen >= 20 en <=30
        for (int i = 0 ; i<10 ; i++){
            System.out.printf("%-3d", random.nextInt(20 , 31));
        }
        System.out.println();
        char letter = (char) random.nextInt('a', 'z' + 1);
        System.out.println(letter);
    }
}
