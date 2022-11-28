package voorbeelden.demo;

public class ExtraOpdracht3 {
    public static void main(String[] args) {
        int[] array1=new int[20];
        for (int i=0; i<array1.length; i++){
            array1[i]=i*7;
        }
        // afdrukken van array1 met for each loop
        for (int getal: array1){
            System.out.printf("%-4d", getal);
        }
        System.out.println();
        // maak array van lengte 10 en vul deze met de getallen 1,3,5,7,9,11,13,15
        //int[] array2 = {1, 3, 5, 7, 9, 11, 13, 15};
        int[] array2 = new int[10];
        for (int i=0; i<array2.length; i++){
            array2[i] = (2*i) + 1;
        }
        for (int getal: array2){
            System.out.printf("%-4d", getal);
        }
        System.out.println();

        // afdrukken in omgekeerde volgorde
        for (int i=array2.length-1; i>=0; i--){
            System.out.print(array2[i] + "\t");
        }
        System.out.println();
    }
}
