package Voorbeelden.Extraopdracht1;
// extra opgave zorg in methode voegBijnamenToe dat de gele markering verdwijnt
public class Voetballer {
    private String naam;
    private int rugnummer;
    private String positie = "onbekend";

    private String[] juistePosities = {"aanvaller", "middenvelder", "verdediger", "doelman"};

    private static int teller; // puntje 6
    // constructors

    public Voetballer(String naam) {
        this.naam = naam;
    }

    public Voetballer() {
    }

    public Voetballer(String naam, int rugnummer, String positie) {
        this.naam = naam;
        this.rugnummer = rugnummer;
        setPositie(positie);
        teller ++;
    }

    public Voetballer(Voetballer voetballer){
        this(voetballer.naam, voetballer.rugnummer, voetballer.positie);
    }

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
        this.positie = bepaalJuistePositie(positie);
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

    public void voegBijnamenToe(String[] namen){
        StringBuilder builder = new StringBuilder(naam);
        for (String n: namen){
            builder.append(" ").append(n);
//            naam += " " + n; => niet oké er worden voor ele + een nieuw string project aangemaakt
        }
        naam = builder.toString();
    }

    // hulpmethode om extraopdracht 1 zie opgave puntje 4
    private String bepaalJuistePositie(String positie){
        for (String juiste: juistePosities){
            if (positie.equals(juiste)){
                return positie;
            }
        }
        return "onbekend";
    }

    public static int getTeller(){
        return teller;
    }
}
