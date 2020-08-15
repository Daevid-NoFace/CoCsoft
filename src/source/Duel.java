package source;

public class Duel {

    private Person attacker;
    private int stars;
    private Person defender;
    private double destructionPercent;

    public Duel(Person attacker, int stars, Person defender, double destructionPercent) {
        this.attacker = attacker;
        this.stars = stars;
        this.defender = defender;
        this.destructionPercent = destructionPercent;
    }

    public Person getAttacker() {
        return attacker;
    }

    public void setAttacker(Person attacker) {
        this.attacker = attacker;
    }

    public int getStars() {
        return stars;
    }

    public void setStars(int stars) {
        this.stars = stars;
    }

    public Person getDefender() {
        return defender;
    }

    public void setDefender(Person defender) {
        this.defender = defender;
    }

    public double getDestructionPercent() {
        return destructionPercent;
    }

    public void setDestructionPercent(double destructionPercent) {
        this.destructionPercent = destructionPercent;
    }

    public double pointsGained(){
        double thCoefficient = 1;
        int difference = attacker.getThLevel()-defender.getThLevel();
        if(difference < 0){
            thCoefficient+= difference*0.25*-1;
        }
        else if(difference > 0){
            thCoefficient-= difference*0.25;
            if (thCoefficient <=0){
                thCoefficient =  0.1;
            }
        }
        return stars*destructionPercent*thCoefficient;
    }
}
