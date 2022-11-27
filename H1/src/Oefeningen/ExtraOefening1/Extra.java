package Oefeningen.ExtraOefening1;

public class Extra {

    public int nummer;
    public void print(){
        for (int i=0;i<nummer / 2;i++){
            printLijn(i);
        }
        for (int i=nummer / 2; i > -1; i--){
            printLijn(i);
        }
    }

    private void printLijn(int regel) {
        for (int j=0;j<nummer - regel;j++){
            if (j == regel || j == nummer - regel - 1){
                System.out.print("X");
            }
            else {
                System.out.print(" ");
            }
        }
        System.out.println();
    }
}
