package Voorbeeldexamen;

public class Team{
    private Sport sport;
    private Speler[] spelers;

    public Team(Sport sport) {
        this.sport = sport;
        this.spelers = new Speler[sport.getAantalSpelers()];
    }

    public void voegSpelerToe(Speler speler){
        int aantal=0;
        for (Speler speler1: spelers){
            if (speler1 != null){
                aantal++;
            }
        }
        if (speler.getSport().equals(sport) && aantal < sport.getAantalSpelers() && !spelerIdKomtVoor(speler.getId())){
            int vrij = vindVrijePositie();
            spelers[vrij] = speler;
        }
        else {
            System.out.println("Foutieve ingave");
        }
    }

    private int vindVrijePositie(){
        for (int i=0; i<spelers.length; i++){
            if (spelers[i] == null){
                return i;
            }
        }
        return -1;
    }

    private boolean spelerKomtVoor(Speler speler){
        for (Speler speler1: spelers){
            if (speler1.equals(speler)){
                return true;
            }
        }
        return false;
    }


    public boolean spelerIdKomtVoor(String id){
        for (Speler speler1: spelers){
            if (speler1 != null && speler1.getId().equals(id)){
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        int aantal=0;
        for (Speler speler: spelers){
            if (speler != null){
                aantal++;
            }
        }
        if (aantal < sport.getAantalSpelers()){
            return "Onvolledig team";

        }
        StringBuilder team = new StringBuilder();
        for (Speler speler: spelers){
            if (speler != null){
                team.append(speler.toString()).append("\n");
            }
        }
        return team.toString();
    }
}
