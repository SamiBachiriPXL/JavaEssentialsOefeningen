package voorbeelden.opdracht9;

import java.util.Scanner;

public class ThermometerApp {
    public static void main(String[] args) {
        Thermometer thermometer = new Thermometer();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Geef de temperatuur in graden celsius");
        double celsius = scanner.nextDouble();
        thermometer.setTemperatuur(celsius);
        System.out.println("Dit is " + thermometer.getFahrenheit() + "Fahrenheit");
        System.out.printf("|%10s|%10s|%n", "Celsius", "Fahrenheit");
        // extra van -10 tot 10 in stappen van 0.5 graden celsius
        for (double c = -10; c<= 25; c+=5){
            thermometer.setTemperatuur(c);
            System.out.printf("|%10.2f|%-10.2f|%n", c, thermometer.getFahrenheit());
        }
    }


}
