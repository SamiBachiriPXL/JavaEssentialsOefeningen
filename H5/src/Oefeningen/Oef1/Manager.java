package Oefeningen.Oef1;

public class Manager extends Werknemer{
    private double bonus;
    private static int aantal;

    public Manager(String naam, String voornaam, String functie, double salaris) {
        super(naam, voornaam, functie, salaris);
        this.bonus=50;
    }

    public Manager(String naam, String voornaam, String functie, double salaris, double bonus) {
        super(naam, voornaam, functie, salaris);
        this.bonus = bonus;
        aantal++;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public static int getAantal() {
        return aantal;
    }

    @Override
    public double getSalaris() {
        return super.getSalaris() + bonus;
    }

    public double getProcAandeelManagers(){
        int aantalWerknemers=Werknemer.getAantal();
        int aantalManagers=getAantal();
        return ((double) aantalManagers/aantalWerknemers)*100;
    }
}
