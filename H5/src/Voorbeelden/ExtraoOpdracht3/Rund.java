package Voorbeelden.ExtraoOpdracht3;


public class Rund extends Dier {
    private boolean melkKoe; // default waarde 0=> vleeskoe

    public Rund(String soort, String voedselType){
        super("rund", "herbivoor");
    }

    public Rund(boolean melkKoe, int geboorteJaar) {
        super("rund", "herbivoor", geboorteJaar);
        this.melkKoe = melkKoe;
    }

    @Override
    public void print() {
        super.print();
        if (melkKoe){
            System.out.println("Het is een melkkoe.");
        } else{
            System.out.println("Het is een vleeskoe.");
        }
    }

    @Override
    public String maakGeluid() {
        return "BueBue";
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append(super.toString());
        if (melkKoe){
            builder.append("Het is een melkkoe");
        } else{
            builder.append("Het is een vleeskoe");
        }
        return builder.toString();
    }
}
