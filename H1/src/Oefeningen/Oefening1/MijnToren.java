package Oefeningen.Oefening1;

public class MijnToren {
    public static void main(String[] args) {
        Toren toren = new Toren();
        toren.setNaam("UP-site");
        toren.setStad("Brussel");
        toren.setDatum(2014);
        toren.setHoogte(142);
        toren.setAantalVerdiepingen(42);

        System.out.println("Naam = " + toren.getNaam());
        System.out.println("Stad = " + toren.getStad());
        System.out.println("datum= " + toren.getDatum());
        System.out.println("Hoogte = " + toren.getHoogte());
        System.out.println("Aantal verdiepingen = " + toren.getAantalVerdiepingen());
    }
}
