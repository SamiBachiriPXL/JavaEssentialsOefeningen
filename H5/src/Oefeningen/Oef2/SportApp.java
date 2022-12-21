package Oefeningen.Oef2;

import java.util.ArrayList;

public class SportApp {
    public static void main(String[] args) {
        ArrayList<Sporter> sporters = new ArrayList<>(10);
        Sporter Sami = new Sporter("Sami", "Bachiri", "basketbal");
        Sporter An = new Sporter("An", "Bex", "zwemmen");
        Sporter Joren = new Voetballer("Joren", "Vos", "KSKHasselt", "verdediger");
        Sporter Joni = new Voetballer("Joni", "Dirix", "KSKHasselt", "verdediger");
        Sporter Jelle = new Voetballer("Jelle", "Maes", "KSKHasselt", "middenvelder");
        Sporter Niels = new Voetballer("Niels", "Maes", "KSKHasselt", "aanvaller");
        Sporter Martijn = new Voetballer("Martijn", "Hox");

        sporters.add(Sami);
        sporters.add(An);
        sporters.add(Joren);
        sporters.add(Joni);
        sporters.add(Jelle);
        sporters.add(Niels);
        sporters.add(Martijn);

        System.out.println("Overzicht sporters (behalve voetbal)");
        for (Sporter sport: sporters){
            if (!sport.getOmschrijving().equals("voetbal")){
                sport.print();
            }
        }

        System.out.println("Overzicht voetballers volgens opstelling");
        ArrayList<Voetballer> aanvallers = new ArrayList<>();
        ArrayList<Voetballer> verdedigers = new ArrayList<>();
        ArrayList<Voetballer> middenvelders = new ArrayList<>();
        ArrayList<Voetballer> onbepaalden = new ArrayList<>();
        for (Sporter sport: sporters){
            if (sport.getOmschrijving().equals("voetbal")){
                if (((Voetballer)sport).getOpstelling().equals("aanvaller")){
                    aanvallers.add((Voetballer)sport);
                } else if (((Voetballer)sport).getOpstelling().equals("verdediger")) {
                    verdedigers.add((Voetballer)sport);
                } else if (((Voetballer)sport).getOpstelling().equals("middenvelder")) {
                    middenvelders.add((Voetballer)sport);
                } else{
                    onbepaalden.add((Voetballer)sport);
                }
            }
        }
        if (middenvelders != null){
            System.out.println("*** middenvelder ***");
            for (Voetballer middenvelder: middenvelders){
                middenvelder.print();
            }
        }
        if (aanvallers != null){
            System.out.println("*** aanvaller ***");
            for (Voetballer aanvaller: aanvallers){
                aanvaller.print();
            }
        }

        if (verdedigers != null){
            System.out.println("*** verdediger ***");
            for (Voetballer verdediger: verdedigers){
                verdediger.print();
            }
        }
        if (onbepaalden != null){
            System.out.println("*** onbepaald ***");
            for (Voetballer onbepaald: onbepaalden){
                onbepaald.print();
            }
        }
    }
}
