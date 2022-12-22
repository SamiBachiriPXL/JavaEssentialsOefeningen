package Oefeningen.Oef3;

import java.util.ArrayList;

public class Gondelbaan {
    private String naam;
    private String land;
    private int hoogteDalstation;
    private int hoogteBergstation;
    private double lengte;
    private int snelheid;
    private int passagiersPerGondel;
    private int aantalGondels;

    public Gondelbaan(String naam, String land, double lengte, int snelheid) {
        this.naam = naam;
        this.land = land;
        this.lengte = lengte;
        this.snelheid = snelheid;
    }

    public Gondelbaan(String naam, String land) {
        this(naam, land, 2, 6);
    }

    public String getNaam() {
        StringBuilder aangepasteNaam = new StringBuilder();
        String[] woorden = naam.split(" ");
        for (String woord :
                woorden) {
            aangepasteNaam.append(woord.substring(0, 1).toUpperCase());
            aangepasteNaam.append(woord.substring(1).toLowerCase());
            aangepasteNaam.append(" ");
        }

        return aangepasteNaam.toString();
    }

    public String getLand() {
        return land;
    }

    public int getHoogteDalstation() {
        return hoogteDalstation;
    }

    public int getHoogteBergstation() {
        return hoogteBergstation;
    }

    public double getLengte() {
        return lengte;
    }

    public int getSnelheid() {
        return snelheid;
    }

    public int getPassagiersPerGondel() {
        return passagiersPerGondel;
    }

    public int getAantalGondels() {
        return aantalGondels;
    }

    public void setNaam(String naam) {

        this.naam = naam;
    }

    public void setLand(String land) {
        if (land.equals("Frankrijk") || land.equals("Oostenrijk") || land.equals("Zwitserland") || land.equals("Italië")){
            this.land = land;
        } else{
            this.land="Onbekend";
        }
    }

    public void setLengte(double lengte) {
        this.lengte = lengte;
    }

    public void setSnelheid(int snelheid) {
        if (snelheid >=3 && snelheid<=8){
            this.snelheid = snelheid;
        } else if (snelheid < 3) {
            this.snelheid = 3;
        } else {
            this.snelheid = 8;
        }
    }

    public void setPassagiersPerGondel(int passagiersPerGondel) {
        this.passagiersPerGondel = passagiersPerGondel;
    }

    public void setAantalGondels(int aantalGondels) {
        this.aantalGondels = aantalGondels;
    }

    public void setHoogte(int laagste,int hoogste){
            this.hoogteDalstation = laagste;
            this.hoogteBergstation = hoogste;
    }

    public int getHoogteVerschil(){
        return Math.abs(hoogteBergstation-hoogteDalstation);
    }

    public int getDuur(){
        return (int)(getLengte() * 1000/getSnelheid())/60;
    }

    public int getVervoersCapaciteit(){
        return  (60*aantalGondels*passagiersPerGondel) / getDuur();
    }

    public String toString(){
        return naam + " [" + getHoogteVerschil() + "m]";
    }
}
