package Oefeningen.Oef1;

public class Werknemer extends Persoon{
    private String functie;
    private double salaris;
    private static final double minimumSalaris = 1000;
    private static int aantal;


    public Werknemer(String naam, String voornaam) {
        this(naam, voornaam, "algemeen bediende", 1800);
    }

    public Werknemer(String naam, String voornaam, String functie, double salaris) {
        super(naam, voornaam);
        this.functie = functie;
        this.salaris = salaris;
        aantal++;
    }

    public String getFunctie() {
        return functie;
    }

    public void setFunctie(String functie) {
        this.functie = functie;
    }

    public double getSalaris() {
        if (salaris<minimumSalaris){
            salaris=minimumSalaris;
            return salaris;
        } else {
            return salaris;
        }
    }

    public void setSalaris(double salaris) {
        this.salaris = salaris;
    }

    public static double getMinimumSalaris() {
        return minimumSalaris;
    }

    public static int getAantal() {
        return aantal;
    }

    @Override
    public void print() {
        super.print();
        System.out.printf("Zijn functie is %s en verdient %.2f%n", functie, getSalaris());
    }
}
