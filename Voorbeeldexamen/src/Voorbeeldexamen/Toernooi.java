package Voorbeeldexamen;

import java.time.LocalDateTime;

public class Toernooi {
    private final int MAX_AANTAL_WEDSTRIJDEN = 10;
    private Wedstrijd[] wedstrijden;

    public void voegWedstrijdToe(Wedstrijd wedstrijd){
        int aantal=0;
        this.wedstrijden = new Wedstrijd[MAX_AANTAL_WEDSTRIJDEN];
        for (Wedstrijd wedstrijd1: wedstrijden) {
            if (wedstrijd1 != null){
                aantal++;
            }
        }
        if (aantal < wedstrijden.length){
            for (int i=0; i<wedstrijden.length; i++){
                if (wedstrijden[i] == null){
                    wedstrijden[i]=wedstrijd;
                    break;
                }
            }
        } else{
            System.out.println("geen ruimte meer voor wedstrijden");
        }

    }

    public LocalDateTime zoekDatumVolgendeWedstrijdVan(String spelerId){
        for (Wedstrijd wedstrijd: wedstrijden){
            if (wedstrijd != null && wedstrijd.spereldIdKomtVoor(spelerId)){
                return wedstrijd.getWedstrijdDatum();
            }
        }
        return null;
    }
}
