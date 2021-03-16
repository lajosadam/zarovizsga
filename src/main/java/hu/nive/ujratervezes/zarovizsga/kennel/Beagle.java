package hu.nive.ujratervezes.zarovizsga.kennel;

public class Beagle extends Dog{

    @Override
    public void feed() {
        setHappiness(getHappiness()+2);
    }

    @Override
    public void play(int hours) {
        setHappiness(getHappiness()+2*hours);
    }

    public Beagle(String name) {
        super(name);
    }
}
