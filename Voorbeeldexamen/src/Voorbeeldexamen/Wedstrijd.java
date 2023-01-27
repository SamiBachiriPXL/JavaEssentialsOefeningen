package Voorbeeldexamen;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Wedstrijd implements DatumVergelijkbaar{

    private LocalDateTime wedstrijdDatum;
    private Team team1;
    private Team team2;
    private Scheidsrechter scheidsrechter;
    private int scoreTeam1;
    private int scoreTeam2;

    public Wedstrijd(Team team1, Team team2, Scheidsrechter scheidsrechter, int dag, int maand, int jaar, int uur, int minuut) {

        this.wedstrijdDatum = LocalDateTime.of(jaar, maand, dag, uur, minuut);
        this.team1 = team1;
        this.team2 = team2;
        this.scheidsrechter = scheidsrechter;
    }

    public boolean spereldIdKomtVoor(String spelerId){
        if ((team1!= null && team1.spelerIdKomtVoor(spelerId)) || (team2!= null && team2.spelerIdKomtVoor(spelerId))){
            return true;
        } else{
            return false;
        }
    }

    public long berekenAantalMinutenNa(LocalDateTime tijd){
        return (long) ChronoUnit.MINUTES.between(wedstrijdDatum, tijd);
    }

    public void setScore(int scoreTeam1, int scoreTeam2){
        this.scoreTeam1 = scoreTeam1;
        this.scoreTeam2 = scoreTeam2;
    }

    public LocalDateTime getWedstrijdDatum() {
        return wedstrijdDatum;
    }

    public String toString(){
        StringBuilder string = new StringBuilder();
        string.append("Team1").append("\n");
        string.append(team1.toString());
        string.append("Team2").append("\n");
        string.append(team1.toString());
        string.append(DateTimeFormatter.ofPattern("dd/MM/yy HH:mm").format(wedstrijdDatum)).append("\n");
        string.append("SCHEIDSRECHTER ").append(scheidsrechter).append("\n");
        if (berekenAantalMinutenNa(LocalDateTime.now()) > 0){
            string.append("SCORE ").append(scoreTeam1).append(" ").append(scoreTeam2);
        }
        return string.toString();
    }
}
