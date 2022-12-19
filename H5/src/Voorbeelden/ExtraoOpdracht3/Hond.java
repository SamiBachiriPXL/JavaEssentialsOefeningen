package Voorbeelden.ExtraoOpdracht3;

import java.time.LocalDate;

public final class Hond extends Dier {
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

    @Override
    public String maakGeluid() {
        return "WafWaf";
    }

    public int getLeeftijd(){
        return LocalDate.now().getYear() - getGeboorteJaar();
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append(super.toString());
        builder.append(String.format("Ik ben %s %s%n", naam, ras));
        builder.append(String.format("Mijn baasje is %s. ", eigenaar));
        builder.append(String.format("Ik ben %d jaar oud.%n", getLeeftijd()));
        builder.append(String.format("Ik maak volgende geluid %s", maakGeluid()));
        return builder.toString();
    }
}
