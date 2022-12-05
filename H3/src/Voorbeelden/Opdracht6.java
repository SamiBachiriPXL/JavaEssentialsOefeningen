package Voorbeelden;

public class Opdracht6 {
    public static void main(String[] args) {
        String tekst = "Dit is een tekst met apen";
        System.out.printf("%s bevat %d laraters\n", tekst, tekst.length());
        // vervang elke a door een 0
        tekst = tekst.replace('a', 'o');
        System.out.println(tekst);

        // druk het aantal keer dat de letter e voorkomt af
        int tel = 0;
        int positie = tekst.indexOf('e');
        while (positie != -1){
            tel++;
            positie = tekst.indexOf('e', positie +1);
        }
        System.out.println("Het aantal keer dat de letter e voorkomt in de tekst = " + tel);
        String tekst1 = "appelen";
        String tekst2 = "peren";
        System.out.printf("Is de inhoud van deze 2 strings hetzelfde %b\n", tekst1.equals(tekst2)); // gele markering => omdat beide niet zijn ingelezen
        // 2 middelste of middelste letter in hoofdletters
        int b2 = tekst1.length()/2; // begin positie van deel2
        int b3 = b2 + 1; // beginpositie van deel3
        if (tekst1.length() % 2 == 0)b2--; // gele markering => is altijd false omdat tekst hard gecodeerd is
        String nieuw = tekst1.substring(0,b2) + tekst1.substring(b2, b3).toUpperCase() + tekst1.substring(b3);
        System.out.println(nieuw);
    }
}
