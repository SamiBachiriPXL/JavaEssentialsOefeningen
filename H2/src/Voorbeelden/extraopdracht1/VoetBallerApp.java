package Voorbeelden.extraopdracht1;

public class VoetBallerApp {
    public static void main(String[] args) {
        Voetballer mertens = new Voetballer();
        mertens.setNaam("Dries Mertens");
        mertens.setPositie("aanvaller");
        mertens.setRugnummer(16);
        System.out.println(mertens.getNaam() + " rugnummer " + mertens.getRugnummer() + " " + mertens.getPositie());
        mertens.verhoogRugnummer();
        System.out.println();
        System.out.println(mertens.getNaam() + " rugnummer " + mertens.getRugnummer() + " " + mertens.getPositie());
        Voetballer debruyne = new Voetballer("Kevin De bruyne");
        Voetballer vertonghen = new Voetballer("Jan Vertonghen", 5, "verdediger");
        Voetballer lukaku = new Voetballer(mertens);
        vertonghen.voegBijnamenToe(new String[] {"Jantje", "SuperJan"});
        System.out.println("Aantal aangemaakte voetballers " + Voetballer.getTeller());
        Voetballer[] voetballers = {mertens, debruyne, vertonghen, lukaku};
        for (Voetballer voetballer: voetballers){
            System.out.printf("%s is een %s%n", voetballer.getNaam(), voetballer.getPositie());
        }
    }
}
