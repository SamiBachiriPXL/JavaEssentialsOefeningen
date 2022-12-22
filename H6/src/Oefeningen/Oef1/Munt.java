package Oefeningen.Oef1;

public enum Munt {
    EEN(1), TWEE(2), VIJF(5), TIEN(10), TWINTIG(20), VIJGTIG(50), EEN_EURO(100), TWEE_EURO(200);

    private final int waarde;

    Munt(int waarde) {
        this.waarde = waarde;
    }

    public int getWaarde(){
        return waarde;
    }
}
