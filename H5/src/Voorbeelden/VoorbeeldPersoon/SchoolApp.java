package Voorbeelden.VoorbeeldPersoon;

public class SchoolApp {
    public static void main(String[] args) {
        Persoon persoon = new Persoon();
        persoon.setNaam("Gerrits");
        persoon.setVoornaam("monkey");
        Student student = new Student();
        student.setNaam("Grootaerts");
        student.setVoornaam("Mo");
        student.setLeerkrediet(120);
        student.setOpleiding("toegepaste informatica");
        student.setStudentnummer(202212356);
//        System.out.printf("student %s %s %n", student.getVoornaam(), student.getNaam());
//        System.out.printf("Studentnummer %d in de richting %s met leerkrediet%d%n", student.getStudentnummer(), student.getOpleiding(), student.getLeerkrediet());
        persoon.print();
        student.print();
        // opdracht 5a polymorf object => object gedeclareerd als  een Persoon maar angemaakt als een student
        Persoon poly = new Student();
        poly.setVoornaam("tristan");
        poly.setNaam("franssen");
        ((Student) poly).setLeerkrediet(60);
        // opdracht 6.4
        Student brecht = new Student("Vanakeren", "brecht");
        Student fenne = new Student("adams", "fenne", 60, 2020146, "medisch secretariaat");
        Lector evy = new Lector("Jans", "evy", 50, 17500);
        Lector hans = new Lector("costers", "hans", 20001235, 100, 3000);
        Persoon[] array = {persoon, student, poly, brecht, fenne, evy, hans};
        for(Persoon pers: array){
            pers.print();
        }
        System.out.println("Het aantal aangemaakte personen =" + Persoon.getAantal());
        System.out.println("Het aantal aangemaakte studenten =" + Student.getAantal());
        System.out.println("Het aantal aangemaakte lectoren =" + Lector.getAantal());
    }
}
