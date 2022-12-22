import java.util.Scanner;

public class DagApp {
    public static void main(String[] args) {
        for (Dag dag: Dag.values()){
            String beschrijving;
            if (dag.isWeekdag()){
                beschrijving = "dag in de week";
            } else{
                beschrijving= "dag in weekend";
            }
            System.out.printf("%s is dagnummer %d (%s)%n", dag, dag.ordinal(), beschrijving);

//            Dag dag1 = Dag.WOENSDAG;
//            Dag dag2 = Dag.ZONDAG;
            System.out.println("geef dag1 in");
            Scanner scanner = new Scanner(System.in);
            Dag dag1 = Dag.valueOf(scanner.next().toUpperCase());
            System.out.println("Geef dag2 in");
            Dag dag2 = Dag.valueOf(scanner.next().toUpperCase());

            if (dag1 == dag2) System.out.println("dag1 en dag2 zijn gelijk");
            else System.out.println("Ze zijn niet gelijk aan elkaar");
            int verschil = dag1.compareTo(dag2); // berekent dag1.ordinale() - dag2.ordinale()
            if (verschil < 0){
                System.out.println("dag1 komt voor dag2");
            } else if (verschil == 0) {
                System.out.println("dag1 en dag2 zijn gelijk");
            } else{
                System.out.println("dag2 komt voor dag1");
            }
            System.out.printf("Er liggen %d dagen tussen%n", Math.abs(verschil));
        }
    }
}
