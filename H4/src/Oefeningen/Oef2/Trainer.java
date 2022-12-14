package Oefeningen.Oef2;

public class Trainer {
    private Pokedex pokedex;
    private String naam;

    public Trainer(String naam) {
        this.naam = naam;
        this.pokedex = new Pokedex(10);
    }

    public Pokedex getPokedex() {
        return pokedex;
    }

    public String getNaam() {
        return naam;
    }

    public void vangPokemon(Pokemon pokemon){
        if (!pokedex.bevat(pokemon)){
            pokedex.voegToe(pokemon);
        }
    }

    public String toString(){
        return naam;
    }
}
