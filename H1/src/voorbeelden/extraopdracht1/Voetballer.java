package voorbeelden.extraopdracht1;

public class Voetballer {
    private String naam;
    private int rugnummer;
    private String positie;

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public void setRugnummer(int rugnummer) {
        if (rugnummer > 22){
            rugnummer = 22;
        } else if (rugnummer < 1) {
            rugnummer = 1;
        }
        this.rugnummer=rugnummer;
    }

    public void setPositie(String positie) {
        this.positie = positie;
    }

    public String getNaam() {
        return naam;
    }

    public int getRugnummer() {
        return rugnummer;
    }

    public String getPositie() {
        return positie;
    }

    public void verhoogRugnummer(){
        setRugnummer(rugnummer + 1);
    }

    public void verhuugRugnummer(int waarde){
        setRugnummer(rugnummer + waarde);
    }
}
