package Oefeningen.Oefening6;

public class Phone {
    private String number;
    private String provider;
    private int numberOfCalls;
    private int numberOfFreeCalls;

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getProvider() {
        return provider;
    }

    public void setProvider(String provider) {
        this.provider = provider;
    }

    public int getNumberOfCalls() {
        return numberOfCalls;
    }

    public void setNumberOfCalls(int numberOfCalls) {
        this.numberOfCalls = numberOfCalls;
    }

    public int getNumberOfFreeCalls() {
        return numberOfFreeCalls;
    }

    public void setNumberOfFreeCalls(int numberOfFreeCalls) {
        this.numberOfFreeCalls = numberOfFreeCalls;
    }

    public void call(String telefoonnummer){
        if (telefoonnummer.equals("112") || telefoonnummer.equals("102") || telefoonnummer.equals("070245245")){
            System.out.println("Calling " + telefoonnummer);
            numberOfFreeCalls++;
        }else{
            System.out.println("Calling " + telefoonnummer);
            numberOfCalls++;
        }
    }

    public void getCost(){
        double prijs=0;
        if (numberOfCalls==0){
            System.out.printf("Phone cost after rest: €%.2f", prijs);
        }else{
            if (provider.equals("Floximus")){
                if (numberOfCalls>20){
                    prijs=(numberOfCalls*0.25)*1.05;
                    System.out.printf("Phone cost: €%.2f", prijs);
                } else{
                    prijs=(numberOfCalls*0.25)-0.01;
                    System.out.printf("Phone cost: €%.2f", prijs);
                }
            }else{
                if (numberOfCalls>20){
                    prijs=(numberOfCalls*0.21)*1.05;
                    System.out.printf("Phone cost: €%.2f", prijs);
                } else{
                    prijs=(numberOfCalls*0.21)-0.01;
                    System.out.printf("Phone cost: €%.2f", prijs);
                }
            }
        }
    }

    public void reset(){
        numberOfCalls=0;
        numberOfFreeCalls=0;
    }
}
