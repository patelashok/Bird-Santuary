package com.bridglelabz.birdsantuary;

public class Duck extends Birds implements Swimable,Flyable {
    static int count;

    @Override
    public String toString() {
        return "Duck{" +
                "colour=" + colour +
                '}';
    }

    Duck(String id){
        this.id=id;
        colour=Colour.WHITE;
    }

    @Override
    public void eat() {
        System.out.println("Duck is eating");
    }

    @Override
    public void incrementCount() {
        count ++;
    }

    @Override
    public void decrementCount() {
        count--;
    }

    @Override
    public void fly() {
        System.out.println("Duck is Flying");
    }

    @Override
    public void swim() {
        System.out.println("Duck is swimming");
    }
}
