package source;

public class Person {

    private String name;
    private int thLevel;

    public Person(String name, int thLevel) {
        this.name = name;
        this.thLevel = thLevel;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getThLevel() {
        return thLevel;
    }

    public void setThLevel(int thLevel) {
        this.thLevel = thLevel;
    }
}
