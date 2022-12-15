package Voorbeelden.ExtraOpdracht1;

import java.util.ArrayList;

public class Dier {
    private String soort;
    private String voedselType;
    private int geboorteJaar;
    private static ArrayList<String> juisteVoedselType = new ArrayList<>();

    private static int aantal;

    static{
        juisteVoedselType.add("herbivoor");
        juisteVoedselType.add("carnivoor");
        juisteVoedselType.add("omnivoor");
    }

    public Dier(String soort, String voedselType) {
        this(soort, voedselType, 2020);
    }

    public Dier(String soort, String voedselType, int geboorteJaar) {
        this.soort = soort;
        setVoedselType(voedselType);
        this.geboorteJaar = geboorteJaar;
        aantal++;
    }

    public String getSoort() {
        return soort;
    }

    public void setSoort(String soort) {
        this.soort = soort;
    }

    public String getVoedselType() {
        return voedselType;
    }

    public void setVoedselType(String voedselType) {
        if (juisteVoedselType.contains(voedselType)){
            this.voedselType=voedselType;
        }else{
            this.voedselType = "onbekend";
        }
    }

    public static int getAantal() {
        return aantal;
    }

    public int getGeboorteJaar() {
        return geboorteJaar;
    }

    public void setGeboorteJaar(int geboorteJaar) {
        this.geboorteJaar = geboorteJaar;
    }
    public void print(){
        System.out.printf("Dit is een %s(%s)%n", soort, voedselType);
    }
}
