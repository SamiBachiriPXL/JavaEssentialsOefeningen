package Voorbeelden;

import java.util.ArrayList;

public class Opdracht9 {
    public static void main(String[] args) {
        // maak een arraylist waarin alleen strings geplaatst kunnen worden
        ArrayList <String> lijst = new ArrayList<>();
        // voeg 3 stringobjecten voorbeeld1, voorbeeld2, voorbeeld3 to
        lijst.add("voorbeeld1");
        lijst.add("voorbeeld2");
        lijst.add("voorbeeld3");
        // voeg een 4de string tussen de eerste en de tweede toe
        lijst.add(1, "voorbeeld4");
        System.out.println(lijst);
        // verander de juist toegevoegde String en druk alles af
        lijst.set(1, "aangepast voorbeeld4"); // opmerking deze methode geeft het object dat gewijzigd wordt terug
        for (String n: lijst){
            System.out.println(n);
        }
        // verwijder het juist toegevoegde element en druk alles af
        lijst.remove(1); // opmerking het verwijderde object wordt teruggegeven
        for (int i=0; i<lijst.size() ; i++){
            System.out.println(lijst.get(i));
        }
        // verwijder alle elementen uit de lijst
        lijst.clear();
        System.out.printf("De lijst bevat nu %d elementen \n", lijst.size());
    }
}
