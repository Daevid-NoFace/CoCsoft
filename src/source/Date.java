package source;

import java.util.ArrayList;

public class Date {

    private ArrayList<Duel> duels;

    public Date(ArrayList<Duel> duels) {
        this.duels = duels;
    }

    public ArrayList getDuels() {
        return duels;
    }

    public void setDuels(ArrayList<Duel> duels) {
        this.duels = duels;
    }
}
