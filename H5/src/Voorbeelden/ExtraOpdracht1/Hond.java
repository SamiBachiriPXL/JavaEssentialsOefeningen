package Voorbeelden.ExtraOpdracht1;

public class Hond extends Dier{
    private String naam;
    private String ras;
    private Persoon eigenaar;
    // opdracht 13
    private static int aantal;

    public Hond(String naam, String ras) {
//        super("hond", "carnivoor");
//        this.naam = naam;
//        this.ras = ras;
        this(naam, ras, 2020);
    }

    public Hond(String naam, String ras, int geboorteJaar) {
        super("hond", "carnivoor", geboorteJaar);
        this.naam = naam;
        this.ras = ras;
        aantal++;
    }

    public Hond(String naam, String ras, String voornaamEigenaar, String naamEigenaar, int geboorteJaar) {
        super(naam, ras,geboorteJaar);
        this.naam = naam;
        this.ras = ras;
        this.eigenaar = new Persoon(naamEigenaar, voornaamEigenaar);
    }

    public static int getAantal() {
        return aantal;
    }

    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public Persoon getEigenaar() {
        return eigenaar;
    }

    public void setEigenaar(Persoon eigenaar) {
        this.eigenaar = eigenaar;
    }

    public String getRas() {
        return ras;
    }

    @Override
    public void print() {
        super.print();
        System.out.printf("Het is %s de %s%n", naam, ras);
        if (eigenaar != null){
            System.out.printf("Mijn baasje is %s %s%n", eigenaar.getVoornaam(), eigenaar.getNaam());
        } else {
            System.out.println("geen baasje");
        }

    }
}
