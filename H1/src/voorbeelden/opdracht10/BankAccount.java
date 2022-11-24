package voorbeelden.opdracht10;

public class BankAccount {
    public String naam;
    public String code;
    public int controlecijfers;
    public long nummer;

    public double bedrag;

    public void setBedrag(double bedrag) {
        this.bedrag = bedrag;
    }

    public double getBedrag() {
        return bedrag;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setControlecijfers(int controlecijfers) {
        this.controlecijfers = controlecijfers;
    }

    public void setNummer(long nummer) {
        this.nummer = nummer;
    }

    public String getNaam() {
        return naam;
    }

    public String getAccount(){
        return code + controlecijfers + nummer;
    }

    public boolean isGeldig(){
        long hulp = nummer * 1000000 + 111400;
        int rest = 98 - (int) hulp % 97;
        return rest == controlecijfers;
    }

    public void haalaf(double bedrag){
        if (bedrag <= this.bedrag){
            this.bedrag -=bedrag;
        } else {
            System.out.println("Er staat niet voldoende op de rekening");
        }
    }
}
