package Voorbeelden;

import java.util.Scanner;

public class Opdracht8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Geef een artikelcode in");
        String artikelCode = scanner.next();
        // controle 2 letters gevolgd door 2 cijfers
        if (artikelCode.length()==4){
            if (Character.isLetter(artikelCode.charAt(0)) && Character.isLetter(artikelCode.charAt(1))){
                if (Character.isDigit(artikelCode.charAt(2)) && Character.isDigit(artikelCode.charAt(3))){
//                    artikelCode = artikelCode.toUpperCase().charAt(0) + artikelCode.substring(1);
                    StringBuilder builder = new StringBuilder();
                    builder.append(Character.toUpperCase(artikelCode.charAt(0)) + artikelCode.substring(1));
                    artikelCode = builder.toString();
                    System.out.println(artikelCode);
                } else {
                    System.out.println("Artikelcode moet eindigen met 2 cijfers");
                }
            }else {
                System.out.println("Artikelcode moet beginnen met 2 letters");
            }
        }else{
            System.out.println("Artikelcode moet bestaan uit 4 tekens");
        }
    }
}
