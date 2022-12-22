package Oefeningen.Oef3;

public class Leraar {
    private String naam;
    private String voornaam;
    private int aanstellingspercentage;
    private Vak[] vakken;
    private static int MAXIMUM_AANTALVAKKEN;

    public Leraar(String naam, String voornaam, int aanstellingspercentage) {
        this.naam = naam;
        this.voornaam = voornaam;
        this.aanstellingspercentage = aanstellingspercentage;
    }

    public String getNaam() {
        return naam;
    }

    public String getVoornaam() {
        return voornaam;
    }

    public int getAanstellingspercentage() {
        return aanstellingspercentage;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public void setVoornaam(String voornaam) {
        this.voornaam = voornaam;
    }

    public void setAanstellingspercentage(int aanstellingspercentage) {
        this.aanstellingspercentage = aanstellingspercentage;
    }

    public void drukGegevens(){
        System.out.printf("Leraar %s %s is aangesteld voor %d%%n", naam, voornaam, aanstellingspercentage);
        System.out.println("Volgende vakken behoren tot het takenpakket:");
        for (Vak vak: vakken){
            if (vak != null){
                System.out.printf("%-3s /t %s %-5d %n", vak.getCode(), vak.getNaam(), vak.getAantalStudiepunten());
            }
        }
    }

    public Vak[] getVakken() {
        return vakken;
    }

    private int getEersteVrijePlaats(){
        for (int i=0; i<vakken.length; i++){
            if (vakken[i] == null){
                return i;
            }
        }
    }

    public void verwijderVak(String vakNaam){

    }
}
