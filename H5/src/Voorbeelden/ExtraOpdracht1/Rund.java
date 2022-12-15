package Voorbeelden.ExtraOpdracht1;

public class Rund extends Dier{
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
}
