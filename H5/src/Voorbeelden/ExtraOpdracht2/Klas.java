package Voorbeelden.ExtraOpdracht2;

import java.util.ArrayList;

public class Klas {
    public static void main(String args[]) {
        ArrayList<Student> lijstStudenten = new ArrayList<>();

        lijstStudenten.add(new Student(10, "Erik"));
        lijstStudenten.add(new Student(20, "Dirk"));
        lijstStudenten.add(new Student(30, "Anne"));

        System.out.println("\nOorspronkelijke klaslijst");
        for (Student student : lijstStudenten) {
            student.drukAf();
        }

        lijstStudenten.add(1, new Student(22, "Piet"));
        lijstStudenten.remove(3);  // Anne weg
        lijstStudenten.set(0, new Student(11, "Ilse"));  // Erik wordt vervangen door Ilse

        System.out.println("\nGewijzigde klaslijst");
        for (Student student : lijstStudenten) {
            student.drukAf();
        }
// er wordt een nieuwe student aangemaakt de indexOf methode maakt gebruik van de equals methode\
        // deze methode test standaard of de referenties gelijk zijn
        // we kunnen op deze manier dus nooit student met naam Ilse vinden
        // oplossing zie later hoofdstuk => herdefiniëring van de equals methode
        int positie = lijstStudenten.indexOf(new Student("Ilse"));

        if (positie == -1) {
            System.out.println("Ilse komt niet voor in de arraylist");
        } else {
            Student gevonden = lijstStudenten.get(positie);
            System.out.println("Opzoeking in de arraylist levert op : ");
            gevonden.drukAf();
        }
    }
}
