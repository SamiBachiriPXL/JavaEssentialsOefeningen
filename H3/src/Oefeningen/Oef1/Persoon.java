package Oefeningen.Oef1;

import java.time.LocalDate;

public class Persoon {

    private String voornaam;
    private String naam;

    private double lengte;

    private double gewicht;

    private LocalDate geboortedatum;

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

    public LocalDate setGeboortedatum(LocalDate geboortedatum) {
        this.geboortedatum = geboortedatum;
        return this.geboortedatum;
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

    public LocalDate getGeboortedatum() {
        return geboortedatum;
    }

//    public String allToString(){
//        return
//            "Deze persoon is " + voornaam + " " + naam + "\n" +
//            "gewicht\t: " + gewicht + "\n" +
//            "lengte\t: " + lengte + "\n" +
//            "geboortejaar\t: " + geboortedatum + "\n";
//    }

    public String allToString(){
        StringBuilder text = new StringBuilder();
        text.append("Deze persoon is ").append(voornaam.toUpperCase()).append(" ").append(naam).append("\n");
        text.append("gewicht: ").append(gewicht).append("\n");
        text.append("lengte: ").append(lengte).append("\n");
        text.append("geboortejaar: ").append(geboortedatum).append("\n");
        return text.toString();
    }

    public double berekenBmi(){
        double BMI = gewicht / (lengte*lengte);
        return Math.round((BMI * 10)/10);
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

//    public void voegVoornamenToe(String[] voornamen){
//        for (String n: voornamen){
//            voornaam +=" " + n;
//        }
//    }

    public void voegVoornamenToe(String[] voornamen){
        StringBuilder string = new StringBuilder();
        string.append(voornaam);
        for (String n: voornamen){
            string.append(" " + n);
        }
        string.toString();
    }

    public int getLeeftijd(){
        return 2022-geboortedatum.getYear();
    }

    public void groei1(){
        setLengte(lengte + 0.01);
    }

    public void groei2(double lengte){
        setLengte(this.lengte+lengte);
    }

    public String geefNaamAfgekort(){
        return voornaam.substring(0, 1).toUpperCase() + "." + naam.substring(0, 1).toUpperCase() + naam.substring(1).toLowerCase();
    }

    public String encrypteerNaam(int getal, String afgekort){
        StringBuilder encrypted = new StringBuilder();
        for (int i=0; i<afgekort.length(); i++){
            encrypted.append((char) (afgekort.charAt(i) + getal));
        }

        return encrypted.toString();
    }
}
