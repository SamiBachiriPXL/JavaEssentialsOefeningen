package voorbeelden.opdracht9;

public class Thermometer {
    private double temperatuur;

    public double getTemperatuur() {
        return temperatuur;
    }

    public void setTemperatuur(double temperatuur) {
        this.temperatuur = temperatuur;
    }

    public double getFahrenheit(){
        double f = 9.0/5 * temperatuur + 32;
        return f;
    }
}
