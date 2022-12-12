package Oefeningen.Oef2;

public class PokemonApp {
    public static void main(String[] args) {
        Trainer Sam = new Trainer("Sam", new Pokedex());
//        Pokedex pokedex1 = new Pokedex();
        Sam.vangPokemon(new Pokemon("Chamander", "Fire"));
        Sam.vangPokemon(new Pokemon("Squirtle", "Water"));
        Sam.vangPokemon(new Pokemon("Ekans", "Poison"));

        System.out.printf("%s heeft volgende Pokemon gevangen:%n", Sam.toString());
        System.out.println(Sam.getPokedex().toString());
    }
}
