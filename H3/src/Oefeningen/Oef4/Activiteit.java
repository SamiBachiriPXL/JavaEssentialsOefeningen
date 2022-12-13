package Oefeningen.Oef4;

import java.time.LocalDate;

public class Activiteit {
    private String naam;
    private LocalDate datum;

    public Activiteit(String naam, LocalDate datum) {
        this.naam = naam;
        this.datum = datum;
    }

    public String getNaam() {
        return naam;
    }

    public LocalDate getDatum() {
        return datum;
    }

    public String toString(){
        return datum + "\t" + naam;
    }
}
