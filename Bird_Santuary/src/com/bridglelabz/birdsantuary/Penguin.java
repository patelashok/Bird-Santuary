package com.bridglelabz.birdsantuary;

public class Penguin extends Birds implements Swimable{
    static int count;

    public Penguin(String id){
        this.id=id;
        colour=Colour.BLACK_WHITE;
    }

    @Override
    public void eat() {
        System.out.println("penguin is eating");
    }

    @Override
    public String toString() {
        return "Penguin{" +id +
                "colour=" + colour +
                '}';
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
    public void swim() {
        System.out.println("penguin is swimming");
    }
}
