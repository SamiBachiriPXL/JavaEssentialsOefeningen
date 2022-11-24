package be.pxl.h1.auto;

public class Auto {
    // eigenschappe = instantievariabelen = field (velden) = attributen=kenmerken
    private String merk;
    private String kleur;
    private int kilometerstand;
    private int aantalDeuren;
    private boolean automaat;
    // private, public = access modifier
    // OO principe zoveel mogelijk verbergen voor de gebruiker van je klasse = datahiding = encapsulation
    // setter = methode waarmee je de waarde van instantie eigenschap kan wijzigen

    public void setKleur(String kleur){
        this.kleur = kleur;
    }

    // shadowing = de instantie eigenschap kleur staat "in de schaduw" van de parameter kleur.

    public void setMerk(String merk) {
        this.merk = merk;
    }

    public void setKilometerstand(int kilometerstand) {
        this.kilometerstand = kilometerstand;
    }

    public void setAantalDeuren(int aantalDeuren) {
        this.aantalDeuren = aantalDeuren;
    }

    public void setAutomaat(boolean automaat) {
        this.automaat = automaat;
    }

    // getters= methoden om de inhoud van een instantievariabele op te vragen
    public String getMerk(){

        return merk;
    }

    public String getKleur() {

        return kleur;
    }

    public int getAantalDeuren() {

        return aantalDeuren;
    }

    public int getKilometerstand() {

        return kilometerstand;
    }

    public boolean isAutomaat() {
        return automaat;
    }



    // opdracht 6
    public double getPrijs(){
        double prijs = 2000;
        if (aantalDeuren == 5){
            prijs = prijs + 5000;
        } else if (aantalDeuren == 3){
            prijs = prijs - 500;
        }
        if (automaat){
            prijs = prijs + 2000;
        } else {
            prijs= prijs * 0.98;
        }
        return prijs;
    }

    public void drukGegevens(){
        System.out.println("Deze auto is van het merk " + merk + " in de kleur " + kleur);
        // extra opdracht 6: druk af al dna niet automaat
        if (automaat){
            System.out.println("Het is geen automaat");
        }
        System.out.println("Het is een wagen met " + aantalDeuren + " deuren.");
        System.out.println("Kilometerstand bedraagt " + kilometerstand + " kilometers.");
        // extra opdracht 6 ook de prijs afdrukken
        System.out.println("De prijs voor de wagen is euro " + getPrijs());

        // method overloading = 2 methoden met dezelfde naam indezelfde klasse met een verschillende parameterlijn
        public void rijden (int aantalKm){
            kilometerstand = kilometerstand + aantalKm;
        }

        public void rijden (int uren, int snelhead){

        }
    }
}
