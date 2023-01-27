package Oefeningen.Oef2;

import java.util.ArrayList;

public class BingoKaart {
    private String naam;
    private ArrayList<Integer> numbers = new ArrayList<>();

    public BingoKaart(String naam) {
        this.naam = naam;
    }

    public void addNumber(int number){
        numbers.add(number);
    }

    public boolean hasNumber(int random){
        return numbers.contains(random);
    }

    public String toString(){
        return "BINGO!!" + "%n" + naam + " " + numbers;
    }
}
