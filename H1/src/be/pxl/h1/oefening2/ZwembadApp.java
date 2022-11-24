package be.pxl.h1.oefening2;

public class ZwembadApp {
    public static void main(String[] args) {
        Zwembad zwembad = new Zwembad();

        zwembad.setBreedte(12.5);
        zwembad.setLengte(25);
        zwembad.setDiepte(1.2);

        System.out.println("Geef de breedte van het zwembad: " + zwembad.getBreedte());
        System.out.println("Geef de lengte van het zwembad: " + zwembad.getLengte());
        System.out.println("Geef de diepte van het zwembad: " + zwembad.getDiepte());
        System.out.println("Liter water: " + zwembad.getVolumeWater());
        System.out.println("Liter ontsmettingsmiddel: " + zwembad.getVolumeOntsmettingsmiddel());
    }
}
