package Oefeningen.Oefening5;

public class Spaceship {
    private String name;
    private int hits;
    private boolean shieldOn;

    public void setName(String name) {
        this.name = name;
    }

    public void setShieldOn(boolean shieldOn) {
        this.shieldOn = shieldOn;
    }

    public String getName() {
        return name;
    }

    public void setHits(int hits) {
        this.hits = hits;
    }

    public boolean getShieldOn() {
        return shieldOn;
    }

    public void setShieldOn(){
        if (!shieldOn){
            shieldOn=true;
            System.out.println(name + " puts shield on");
        } else{
            shieldOn=false;
            System.out.println(name + " puts shield off");
        }
    }

    public void fire(Spaceship spaceship){
        System.out.println(name + " fires at " + spaceship.name);
        if (!spaceship.getShieldOn()){
            spaceship.hits +=1;
        } else{
            hits++;
        }
    }

    public void isDestroyed(){
        System.out.println(name + " is destroyed?");
        System.out.println(hits >= 5);
    }
}
