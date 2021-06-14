package com.bridglelabz.birdsantuary;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class BirdSanctuaryManager extends Throwable {
    static BirdSanctuaryManager instance;

    Set<Birds> birdList = new HashSet<Birds>();
    private BirdSanctuaryManager() {
    }

    static synchronized BirdSanctuaryManager getInstance() {
        if (instance == null) {
            instance = new BirdSanctuaryManager();
        }
        return instance;
    }
    public void add(Birds bird) throws  BirdSanctuaryException {
        if (birdList == null) {
            throw new BirdSanctuaryException();
        }
        else {
            if (birdList.add(bird)) {
                bird.incrementCount();
                bird.totalCount++;
            }
        }
    }







    public void remove(Birds bird){
        if(birdList.remove(bird))
            bird.decrementCount();
    }

    public void print() {
        for(Birds list: birdList) {
            System.out.println(list);
        }
    }

    public void printFlyables(){
        birdList.stream().filter(bird -> bird instanceof Flyable).collect(Collectors.toList())
        .forEach(bird -> ((Flyable)bird).fly());
    }

    public void printSwimmable(){
        birdList.stream().filter(birds -> birds instanceof Swimable).map(birds -> (Swimable)birds)
        .forEach(bird -> ((Swimable)bird).swim());
    }

    public void printEatable() {
        birdList.stream().filter(birds -> birds instanceof Eatable).map(birds -> (Eatable)birds)
                .forEach(bird -> ((Eatable)bird).eat());
    }
 }




