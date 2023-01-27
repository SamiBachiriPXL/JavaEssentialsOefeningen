package Voorbeeldexamen;

public enum Sport {
    VOETBAL(11), VOLLEYBAL(8), TENNIS(2);

    private int aantalSpelers;

    Sport(int aantalSpelers) {
        this.aantalSpelers = aantalSpelers;
    }

    public int getAantalSpelers() {
        return aantalSpelers;
    }

    public String toString(){
        switch (this) {
            case VOETBAL:
                return "voe";
            case VOLLEYBAL:
                return "vol";
            case TENNIS:
                return "ten";
            default:
                return "";
        }
    }
}
