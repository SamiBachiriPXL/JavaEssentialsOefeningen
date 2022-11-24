package voorbeelden.opdracht7;

public class PlaneetApp {
    public static void main(String[] args) {
        Planeet mars = new Planeet();

        mars.setNaam("Mars");
        mars.setDiameter(6792);
        mars.setAfstandzon(227900000);

        Planeet neptunus = new Planeet();

        neptunus.setNaam("Neptunus");
        neptunus.setDiameter(49528);
        neptunus.setAfstandzon(449510000);
        // Welke planeet het dichst bij de zon?

        if (mars.getAfstandzon()>neptunus.getAfstandzon()){
            System.out.println(mars.getNaam() + "staat het dichst bij de zon ");
        }else {
            System.out.println(neptunus.getNaam() + "staat het dichst bij de zon");
        }
        // de aarde staat op 1AE van de zon
        Planeet aarde = new Planeet();
        aarde.setNaam("Aarde");
        aarde.setAfstandzon(149600000);
        aarde.setDiameter(12756);
        // Mars uitgedrukt in AE
        double afstandMarsInAE = (double)(mars.getAfstandzon() / aarde.getAfstandzon());
        System.out.println("De afstand van mars tot de zon in AE " + afstandMarsInAE);
        // Neptunus uitgedrukt in AE
        double afstandNeptunusInAE = (double)(neptunus.getAfstandzon() / aarde.getAfstandzon());
        System.out.println("De afstand van neptunus tot de zon in AE " + afstandNeptunusInAE);
    }
}
