package Oefeningen.Oefening4;

public class Hotel {
    public String hotelcode;
    public int aantalSterren;
    public char kindercode;



    public String getSterren(){
        String sterren="";
        for (int i=0; i<aantalSterren; i++){
            sterren= sterren + "*";
        }
        return sterren;
    }

    public double getPrijs(){
       double prijs=0;
       if (hotelcode.equals("HI")){
           prijs=70;
           return prijs;
       }
       if (aantalSterren>3){
           prijs=60;
       } else if (aantalSterren==3) {
           if (hotelcode.equals("BR") || hotelcode.equals("AN")){
               prijs=60;
               return prijs;
           }
           prijs=56;
       } else {
           prijs=48;
       }
        return prijs;
    }

    public double getPrijsKind(){
        double prijs=0;
        if (kindercode == 'A')
        {
            if (aantalSterren<3 || hotelcode.equals("HA")){
                prijs=0;
            }else{
                prijs=this.getPrijs() * 0.5;
            }
        }else{
            prijs=this.getPrijs() * 0.5;
        }

        return prijs;
    }
}
