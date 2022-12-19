package Voorbeelden.ExtraoOpdracht3;

import java.util.Objects;

public class Persoon {
    private String naam;
    private String voornaam;

    public Persoon(String naam, String voornaam) {
        this.naam = naam;
        this.voornaam = voornaam;
    }

    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public String getVoornaam() {
        return voornaam;
    }

    public void setVoornaam(String voornaam) {
        this.voornaam = voornaam;
    }

    @Override
    public final String toString() {
        return voornaam + " " + naam;
    }

    @Override
    public boolean equals(Object o) { //opdracht 3.5
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Persoon persoon = (Persoon) o;
        return naam.equals(persoon.naam) && voornaam.equals(persoon.voornaam);
    }

    @Override
    public int hashCode() {
        return Objects.hash(naam, voornaam);
    }
}
