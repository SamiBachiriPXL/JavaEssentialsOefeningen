package Oefeningen.Oef3;

public class GondelbaanApp {
    public static void main(String[] args) {
        Gondelbaan gondelbaan = new Gondelbaan("MonKEY MaN fOr LOSERS", "Frankrijk", 2.1, 4);
        gondelbaan.setHoogte(1500, 3000);
        System.out.printf("Dal is %d en Berg is %d\n", gondelbaan.getHoogteDalstation(), gondelbaan.getHoogteBergstation());
        System.out.println("Hoogteverschil tussen dal en berg is " + gondelbaan.getHoogteVerschil());
        int duur=gondelbaan.getDuur();
        System.out.println("Duur is " + duur);
        gondelbaan.setAantalGondels(15);
        gondelbaan.setPassagiersPerGondel(7);
        int vervoersCapaticeit = gondelbaan.getVervoersCapaciteit();
        System.out.println("Vervoerscapateit = " + vervoersCapaticeit);

        System.out.println(gondelbaan.toString());
    }
}
