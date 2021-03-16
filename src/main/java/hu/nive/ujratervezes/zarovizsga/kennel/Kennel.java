package hu.nive.ujratervezes.zarovizsga.kennel;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.stream.Collectors;

public class Kennel {

    List<Dog> dogs = new ArrayList<>();

    public void addDog(Dog dog){
        dogs.add(dog);
    }

    public List<Dog> getDogs() {
        return dogs;
    }

    public void feedAll(){
        for(Dog d: dogs){
            if(d instanceof Husky){
                d.feed();
            } else if(d instanceof Beagle){
                d.feed();
            }
        }
    }

    public Dog findByName(String name){
        try{
            return dogs.stream().filter(x->x.getName().equals(name)).findFirst().get();
        }catch (NoSuchElementException e){
            throw new IllegalArgumentException();
        }
    }
    public void playWith(String name, int hapiness){
        dogs.stream().filter(x->x.getName().equals(name)).findFirst().get().play(hapiness);
    }
    public List<String> getHappyDogNames(int minHappiness){
        List<String> happyDogList = new LinkedList<>();
        List<Dog> happyDogCore = dogs.stream().filter(x->x.getHappiness()==minHappiness).collect(Collectors.toList());
         happyDogCore.stream().forEach(x->happyDogList.add(x.getName()));
        return happyDogList;
    }
}
