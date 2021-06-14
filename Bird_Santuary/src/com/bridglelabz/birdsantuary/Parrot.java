package com.bridglelabz.birdsantuary;

public class Parrot extends Birds implements Flyable {
    static  int count;


    Parrot(String id)
    {
        this.id=id;
        colour=Colour.GREEN;
    }

    @Override
    public void eat() {
        System.out.println("Parrot is eating");
    }

    @Override
    public void fly() {
        System.out.println("Parrot is Flying");
    }

    @Override
    public void incrementCount() {
        count++;
    }

    @Override
    public void decrementCount() {
        count--;
    }

    @Override
    public String toString() {
        return "Parrot{id " + id + ",color=" + colour   + '}';
    }



}

