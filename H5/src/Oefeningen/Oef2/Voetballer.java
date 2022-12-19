package Oefeningen.Oef2;

public final class Voetballer extends Sporter{
    private String club;
    private String opstelling;

    String[] array = {"middenvelder", "aanvaller", "verdediger"};

    public Voetballer(String naam, String voornaam) {
        super(naam, voornaam, "voetbal");
        club = "onbepaald";
        opstelling = "onbepaald";
    }

    public Voetballer(String naam, String voornaam, String club, String opstelling) {
        super(naam, voornaam, "voetbal");
        this.club = club;
        this.opstelling = opstelling;
    }

    public String getOpstelling() {
        for (String woord: array){
            if (woord.equals(opstelling))
                return opstelling;
        }
        opstelling = "onbepaald";
        return opstelling;
    }

    public String getClub() {
        return club;
    }

    public void setClub(String club) {
        this.club = club;
    }

    public void setOpstelling(String opstelling) {
        this.opstelling = opstelling;
    }

    public String[] getArray(){
        return array;
    }

    @Override
    public void print() {
        super.print();
        System.out.printf("club: %s opstelling: %s%n", club, opstelling);
    }
}
