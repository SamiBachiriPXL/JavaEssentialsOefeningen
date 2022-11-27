package Oefeningen.ExtraOefening1;

import java.util.Scanner;

public class ExtraApp {
    public static void main(String[] args) {
        Extra patroon = new Extra();
        Scanner scanner = new Scanner(System.in);
        System.out.println("ingegeven getal:");
        patroon.nummer = scanner.nextInt();
        if (patroon.nummer %2 ==0){
            patroon.nummer= scanner.nextInt();;
        }
        patroon.print();
    }
}
