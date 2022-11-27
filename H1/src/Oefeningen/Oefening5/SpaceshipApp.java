package Oefeningen.Oefening5;

public class SpaceshipApp {
    public static void main(String[] args) {
        Spaceship spaceship1 = new Spaceship();
        spaceship1.setName("BS Galactica");
        spaceship1.setShieldOn(false);
        spaceship1.setHits(0);

        Spaceship spaceship2 = new Spaceship();
        spaceship2.setName("STS Shade");
        spaceship2.setShieldOn(false);
        spaceship2.setHits(0);

        spaceship1.fire(spaceship2);
        spaceship2.fire(spaceship1);
        spaceship1.setShieldOn();
        spaceship2.fire(spaceship1);
        spaceship1.fire(spaceship2);
        spaceship1.fire(spaceship2);
        spaceship1.fire(spaceship2);
        spaceship1.fire(spaceship2);
        spaceship1.isDestroyed();
        spaceship2.isDestroyed();
    }
}
