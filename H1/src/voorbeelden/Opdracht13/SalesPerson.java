package voorbeelden.Opdracht13;

public class SalesPerson {
    private String naam;
    private double[] verkoopcijfers = new double[12];

    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public void setVerkoopMaand(int maandnr, double verkocht){
        verkoopcijfers[maandnr - 1] = verkocht;
    }

    public double getTotaalVerkocht(){
        double totaal=0;
        for (double bedrag: verkoopcijfers){
            totaal+=bedrag;
        }
        return totaal;
    }
    public double getGemiddeldVerkocht(){
        return getTotaalVerkocht() / verkoopcijfers.length;
    }
}
