package Voorbeelden.VoorbeeldPersoon;

public class Student extends Persoon{
    private int leerkrediet;
    private int studentnummer;
    private String opleiding;

    private static int aantal;
    // opdracht 6.1

    public Student(String naam, String voornaam, int leerkrediet, int studentnummer, String opleiding) {
        super(naam, voornaam);
        this.leerkrediet = leerkrediet;
        this.studentnummer = studentnummer;
        this.opleiding = opleiding;
        aantal++;
    }

    public Student(String naam, String voornaam){
        this(naam, voornaam, 140, 1599999, "xxx");
    }

    public Student() {
        this("onbekend", "onbekend");
    }

    public Student(Student student){
        this(student.getNaam(), student.getVoornaam(), student.getLeerkrediet(), student.getStudentnummer(), student.getOpleiding());
    }

    // opdracht 3.3
    public int getLeerkrediet() {
        return leerkrediet;
    }

    public void setLeerkrediet(int leerkrediet) {
        this.leerkrediet = leerkrediet;
        if (this.leerkrediet < 0){
            this.leerkrediet = 0;
        } else if (leerkrediet > 140) {
            this.leerkrediet=140;
        }
    }

    public int getStudentnummer() {
        return studentnummer;
    }

    public void setStudentnummer(int studentnummer) {
        this.studentnummer = studentnummer;
    }

    public String getOpleiding() {
        return opleiding;
    }

    public void setOpleiding(String opleiding) {
        this.opleiding = opleiding;
    }
    // opdracht 7.3

    public static int getAantal() {
        return aantal;
    }

    @Override
    public void print(){
        super.print();
        System.out.printf("Studentnummer %d in de richting %s met leerkrediet%d%n", studentnummer, opleiding, leerkrediet);
    }
}
