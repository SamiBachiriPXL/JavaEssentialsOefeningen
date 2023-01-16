package Oefeningen.Oef1;

public class Afbeelding extends Bestand{

    private int[] dimensies;

    public Afbeelding(String naam, int[] dimensies) {
        super(naam);
        this.dimensies = dimensies;
        setBestandsGrootte(dimensies[0] * dimensies[1] * 3);
    }

    @Override
    public void voerUit() {
        System.out.println(getNaam());
        for (int i=0; i<dimensies[0]; i++){
            for (int j=0; j<dimensies[1]; j++){
                System.out.printf("%s", getInhoud().charAt((i*10)+j));
            }
            System.out.println();
        }
    }
}
