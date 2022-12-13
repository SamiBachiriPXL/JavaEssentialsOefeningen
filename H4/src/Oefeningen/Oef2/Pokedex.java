package Oefeningen.Oef2;

public class Pokedex {
    private Pokemon[] pokemon;

    public Pokedex(int aantal) {
        pokemon = new Pokemon[aantal];
    }

    public Pokedex() {
        this(10);
    }

    public Pokemon[] getPokemon() {
        return pokemon;
    }

    public boolean bevat(Pokemon pokemon){
        for (int i = 0; i< this.pokemon.length; i++){
            if (this.pokemon != null){
                if (this.pokemon[i]==pokemon){
                    return true;
                }
            }
        }
        return false;
    }

    public void voegToe(Pokemon pokemon){
        for (int i = 0; i< this.pokemon.length; i++){
            if (this.pokemon[i]==null){
                this.pokemon[i] = pokemon;
                break;
            }
        }
    }

    public String toString(){
        StringBuilder string = new StringBuilder();
        for (Pokemon poke: pokemon){
            if (poke != null){
                string.append("-").append(poke.toString()).append("\n");
            }
        }
        return string.toString();
    }
}
