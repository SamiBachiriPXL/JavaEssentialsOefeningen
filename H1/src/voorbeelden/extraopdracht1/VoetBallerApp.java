package voorbeelden.extraopdracht1;

public class VoetBallerApp {
    public static void main(String[] args) {
        Voetballer mertens = new Voetballer();
        mertens.setNaam("Dries Mertens");
        mertens.setPositie("Aanvaller");
        mertens.setRugnummer(17);
        System.out.println(mertens.getNaam() + " rugnummer " + mertens.getRugnummer() + " " + mertens.getPositie());
        mertens.verhoogRugnummer();
        System.out.println();
        System.out.println(mertens.getNaam() + " rugnummer " + mertens.getRugnummer() + " " + mertens.getPositie());
    }
}
