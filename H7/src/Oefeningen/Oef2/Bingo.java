package Oefeningen.Oef2;

public class Bingo {
    public static void main(String[] args) {
        BingoKaart Sam = new BingoKaart("Sam");
        Sam.addNumber(97);
        Sam.addNumber(97);
        Sam.addNumber(96);
        Sam.addNumber(68);
        Sam.addNumber(31);
        Sam.addNumber(78);
        BingoKaart Sander = new BingoKaart("Sander");
        Sander.addNumber(31);
        Sander.addNumber(17);
        Sander.addNumber(33);
        Sander.addNumber(56);
        Sander.addNumber(5);
        Sander.addNumber(63);
        BingoKaart Nele = new BingoKaart("Nele");
        Nele.addNumber(31);
        Nele.addNumber(17);
        Nele.addNumber(33);
        Nele.addNumber(56);
        Nele.addNumber(5);
        Nele.addNumber(63);

        int nummer = 7;
        System.out.printf("Nummer %d getrokken...", nummer);
        if (Sam.hasNumber(nummer)){
            System.out.println(Sam.toString());
        }
    }
}
