package Oefeningen.ExtraOef1;

public class TreinReis extends Reis{
    private Boolean nationaal;
    private String specificatie;
    private String[] ritten = {"IC", "IR", "L", "P"};

    public TreinReis(String bestemming) {
        super(bestemming);
        nationaal=true;
        specificatie="IC";
    }

    public TreinReis(String bestemming, double prijs, Boolean nationaal, String specificatie) {
        super(bestemming, prijs);
        this.nationaal = nationaal;
        this.specificatie = specificatie;
    }

    public String checkSpecificatie(){
        if (nationaal){
            for (String rit: ritten){
                if (!specificatie.equals(rit)){
                    return specificatie="IC";
                }
            }
        }
        return specificatie;
    }

    public void setSpecificatie(String specificatie) {

        this.specificatie = checkSpecificatie();
    }

    public String getSpecificatie() {
        return specificatie;
    }

    @Override
    public String toString() {
        return super.toString() + "\n" + "Nationale treinreis (" + specificatie + ")";
    }
}
