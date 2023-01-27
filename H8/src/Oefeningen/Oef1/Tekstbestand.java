package Oefeningen.Oef1;

public class Tekstbestand extends Bestand{
    public Tekstbestand(String naam) {
        super(naam, naam.length());
    }

    @Override
    public void voerUit() {
        setNaam(getNaam().toUpperCase());
        System.out.println(getNaam());
        System.out.println(getInhoud());
    }
}
