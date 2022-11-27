package Oefeningen.Oefening4;

import java.util.Scanner;

public class HotelApp {
    public static void main(String[] args) {
        Hotel hotel = new Hotel();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Geef het aantal volwassenen: ");
        int aantalVolwassenen = scanner.nextInt();
        System.out.println("Geef het aantal kinderen: ");
        int aantalKinderen = scanner.nextInt();
        System.out.println("Geef een hotelcode: ");
        hotel.hotelcode = scanner.next();
        while (!hotel.hotelcode.equals("/")){
            System.out.println("Geef het aantal sterren: ");
            hotel.aantalSterren = scanner.nextInt();
            System.out.println("Geef een kindercode: ");
            hotel.kindercode = scanner.next().charAt(0);
            System.out.printf(
                    "%s%s %.2f %.2f %.2f\n",
                    hotel.hotelcode,
                    hotel.getSterren(),
                    hotel.getPrijs(),
                    hotel.getPrijsKind(),
                    (hotel.getPrijsKind()*aantalKinderen)+ (hotel.getPrijs())*aantalVolwassenen
            );
            System.out.println("Geef een hotelcode: ");
            hotel.hotelcode = scanner.next();
        }

    }
}
