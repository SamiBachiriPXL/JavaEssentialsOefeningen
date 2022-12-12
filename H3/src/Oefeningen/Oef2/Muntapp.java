package Oefeningen.Oef2;

import java.util.ArrayList;

public class Muntapp {
    public static void main(String[] args) {
        ArrayList <Munt> lijst= new ArrayList<>();
        Munt munt1 = new Munt("Britse pond", 0.985);
        Munt munt2 = new Munt("Dollar", 1.287);
        Munt munt3 = new Munt("Russische roebel", 86.950);
        Munt munt4 = new Munt("Euro", 1.000);

        lijst.add(munt1);
        lijst.add(munt2);
        lijst.add(munt3);
        lijst.add(munt4);
        String rounding = "%." + Munt.getAfronding() + "f %s\n";
        for (int i=0; i<lijst.size(); i++){
            System.out.printf(rounding, Math.round(lijst.get(i).getKoers() * 1000)/1000.0, lijst.get(i).getNaam());
        }

        System.out.printf("Overzicht koersen tov %s: 1 %s =\n", lijst.get(0).getNaam(), lijst.get(0).getNaam());
        for (int i=1; i< lijst.size(); i++){
            System.out.printf(rounding, 1/lijst.get(0).getKoers()*lijst.get(i).getKoers(), lijst.get(i).getNaam());
        }
    }
}
