package Oefeningen.Oefening1;

public class Persoon {

    private String voornaam;
    private String naam;

    private double lengte;

    private double gewicht;

    private int geboortejaar;

    public Persoon(String voornaam, String naam) {
        this.naam = naam;
        this.voornaam = voornaam;
    }

    public Persoon() {
        this.naam = "onbekend";
        this.voornaam = "onbekend";
    }

    public Persoon(Persoon persoon){
        this(persoon.voornaam, persoon.naam);
        lengte = persoon.lengte;
        gewicht = persoon.gewicht;
        geboortejaar = persoon.geboortejaar;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public void setVoornaam(String voornaam) {
        this.voornaam = voornaam;
    }

    public void setLengte(double lengte) {
        if (lengte > 2.40){
            this.lengte=2.40;
        } else{
            this.lengte=lengte;
        }

    }

    public void setGewicht(double gewicht) {
        this.gewicht = gewicht;
    }

    public void setGeboortejaar(int geboortejaar) {
        this.geboortejaar = geboortejaar;
    }
    public String getNaam() {
        return naam;
    }

    public String getVoornaam() {
        return voornaam;
    }

    public double getLengte() {
        return lengte;
    }

    public double getGewicht() {
        return gewicht;
    }

    public int getGeboortejaar() {
        return geboortejaar;
    }

    public String allToString(){
        return
            "Deze persoon is " + voornaam + " " + naam + "\n" +
            "gewicht\t: " + gewicht + "\n" +
            "lengte\t: " + lengte + "\n" +
            "geboortejaar\t: " + geboortejaar + "\n";
    }

    public double berekenBmi(){
        return gewicht / (lengte*lengte);
    }

    public String geefOmschrijving(){
        if (berekenBmi() < 18){
            return "ondergewicht";
        } else if (berekenBmi() >= 18 && berekenBmi() < 25) {
            return "normaal";
        } else if (berekenBmi() >= 25 && berekenBmi() < 30) {
            return "overgewicht";
        } else if (berekenBmi() >= 30 && berekenBmi() < 40) {
            return "normaal";
        } else{
            return "moribde obesitas";
        }
    }

    public void voegVoornamenToe(String[] voornamen){
        for (String n: voornamen){
            voornaam +=" " + n;
        }
    }

    public int getLeeftijd(){
        return 2022-geboortejaar;
    }

    public void groei1(){
        setLengte(lengte + 0.01);
    }

    public void groei2(double lengte){
        setLengte(this.lengte+lengte);
    }
}
