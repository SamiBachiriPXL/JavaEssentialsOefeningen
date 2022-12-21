package Oefeningen.Oef1;

public class WerknemerApp {
    public static void main(String[] args) {
        Werknemer Sami = new Werknemer("Bachiri", "Sami", "arbeider", 400);
        Werknemer Sander = new Werknemer("Vanoverloop", "Sander");
        Manager Simon = new Manager("Berk", "Simon", "Ploegbaas", 1500, 300);

        Sami.print();
        Sander.print();
        Simon.print();
    }
}
