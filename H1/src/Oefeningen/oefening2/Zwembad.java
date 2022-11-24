package Oefeningen.oefening2;

public class Zwembad {
    private double lengte;
    private double breedte;
    private double diepte;

    public void setLengte(double lengte) {
        this.lengte = lengte;
    }

    public void setBreedte(double breedte) {
        this.breedte = breedte;
    }

    public void setDiepte(double diepte) {
        this.diepte = diepte;
    }

    public double getLengte() {
        return lengte;
    }


    public double getBreedte() {
        return breedte;
    }

    public double getDiepte() {
        return diepte;
    }

    public double getVolume(){
        return (breedte * lengte * diepte) * 1000;
    }

    public double getVolumeWater(){
        return getVolume() * 0.98;
    }

    public double getVolumeOntsmettingsmiddel(){
        return getVolume() * 0.02;
    }
}
