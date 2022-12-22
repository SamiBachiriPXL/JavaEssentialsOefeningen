public enum Dag {
//    //MAANDAG, DINSDAG, WOENSDAG, DONDERDAG, VRIJDAG, ZATERDAG, ZONDAG; // opdracht 1
//    MAANDAG(true), DINSDAG(true), WOENSDAG(true), DONDERDAG(true), VRIJDAG(true), ZATERDAG(false), ZONDAG(false);
    MAANDAG, DINSDAG, WOENSDAG, DONDERDAG, VRIJDAG, ZATERDAG(false), ZONDAG(false);
    private boolean weekdag = true;

    Dag(boolean weekdag) {
        this.weekdag = weekdag;
    }


    Dag(){

    }

    public boolean isWeekdag() {
        return weekdag;
    }

    @Override
    public String toString() {
        return name().toLowerCase();
    }
}
