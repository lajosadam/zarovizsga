package hu.nive.ujratervezes.zarovizsga.kennel;

public abstract class Dog {
    private String name;
    private int happiness=0;

   public abstract void feed();
    public abstract void play(int hours);

    public Dog(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHappiness() {
        return happiness;
    }

    public void setHappiness(int happiness) {
        this.happiness = happiness;
    }
}
