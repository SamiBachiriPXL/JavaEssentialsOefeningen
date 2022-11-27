package Oefeningen.Oefening6;

import java.util.Scanner;

public class PhoneApp {
    public static void main(String[] args) {
        Phone phone = new Phone();

        phone.setNumber("0547898");
        phone.setProvider("Floximus");
        phone.setNumberOfCalls(0);
        phone.setNumberOfFreeCalls(0);

        Scanner scanner = new Scanner(System.in);
        for (int i=0; i<=21; i++){
            String number2 = scanner.next();
            phone.call(number2);
        }
        phone.getCost();
        phone.reset();
        phone.getCost();
    }
}
