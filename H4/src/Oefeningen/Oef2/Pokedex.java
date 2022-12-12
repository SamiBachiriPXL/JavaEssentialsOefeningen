package Oefeningen.Oef2;

public class Pokedex {
    private Pokemon[] pokemons;

    public Pokedex(int aantal) {
        pokemons = new Pokemon[aantal];
    }

    public Pokedex() {
        this(10);
    }

    public Pokemon[] getPokemons() {
        return pokemons;
    }

    public boolean bevat(Pokemon pokemon){
        for (int i=0; i<pokemons.length; i++){
            if (pokemons != null){
                if (pokemons[i]==pokemon){
                    return true;
                }
            }
        }
        return false;
    }

    public void voegToe(Pokemon pokemon){
        for (int i=0; i<pokemons.length; i++){
            if (pokemons[i]==null){
                pokemons[i] = pokemon;
                break;
            }
        }
    }

    public String toString(){
        StringBuilder string = new StringBuilder();
        for (Pokemon poke: pokemons){
            if (poke != null){
                string.append("-").append(poke.toString()).append("\n");
            }
        }
        return string.toString();
    }
}
