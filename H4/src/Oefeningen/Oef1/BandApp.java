package Oefeningen.Oef1;

public class BandApp {
    public static void main(String[] args) {
        Muzikant Sam = new Muzikant("Sam", new Instrument("Gitaar", "Bow bow bow"));
        Muzikant Heidi = new Muzikant("Heidi", new Instrument("Drum", "Boenk baf boenk af"));
        Muzikant Ingrid = new Muzikant("Ingrid", new Instrument("Bas", "Blim blim"));
        Muzikant Nele = new Muzikant("Nele", new Instrument("Klarinet", "Pftooooooeee"));
        Muzikant Francis = new Muzikant("Francis", new Instrument("Triangle", "Wawaawa"));

        Muzikant[] muzikanten = {Sam, Heidi, Ingrid, Nele, Francis};

        Band band = new Band("PXL-Digital", muzikanten);

        System.out.println(band.toString());

        band.speel(20);
    }


}
