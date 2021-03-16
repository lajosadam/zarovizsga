package hu.nive.ujratervezes.zarovizsga.kennel;

public class Husky extends Dog{

    @Override
    public void feed() {
        setHappiness(getHappiness()+4);
    }

    @Override
    public void play(int hours) {
        setHappiness(getHappiness()+3*hours);
    }

    public Husky(String name) {
        super(name);
    }
}
