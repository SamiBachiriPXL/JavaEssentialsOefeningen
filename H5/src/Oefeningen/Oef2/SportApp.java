package Oefeningen.Oef2;

import java.util.ArrayList;

public class SportApp {
    public static void main(String[] args) {
        ArrayList<Sporter> sporters = new ArrayList<>(10);
        System.out.println("Overzicht sporters (behalve voetbal)");
        for (Sporter sport: sporters){
            if (!sport.getOmschrijving().equals("voetbal")){
                sport.print();
            }
        }

        System.out.println("Overzicht voetballers volgens opstelling");
//        for (Sporter voetballer: sporters){
//            if (voetballer.getOmschrijving().equals("voetballer"))){
//                if (){
//
//                }
//            }
//        }
    }
}
