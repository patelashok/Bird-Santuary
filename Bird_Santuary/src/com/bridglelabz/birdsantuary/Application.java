package com.bridglelabz.birdsantuary;
public class Application {
    public static void main(String[] args)throws BirdSanctuaryException {
        System.out.println("Welcome to Bird Sanctuary");
        BirdSanctuaryManager birdSanctuaryManager =  BirdSanctuaryManager.getInstance();

        Parrot parrot1 = new Parrot("p1");
        Parrot parrot2 = new Parrot("p2");
        Parrot parrot3 = new Parrot("p3");
        Parrot parrot4 = new WhiteParrot("p4");

        Duck duck1 = new Duck("d1");
        Duck duck2 = new Duck("d2");
        Duck duck3 = new Duck("d3");

        Penguin penguin1 = new Penguin("pn1");
        Penguin penguin2 = new Penguin("pn2");
        Penguin penguin3 = new Penguin("pn3");

        try {
            birdSanctuaryManager.add(parrot1);
        }catch (BirdSanctuaryException e1){
            e1.printStackTrace();
        }
        try {
            birdSanctuaryManager.add(parrot2);
        }catch (BirdSanctuaryException e2){
            e2.printStackTrace();
        }
        try {
            birdSanctuaryManager.add(parrot3);
        }catch (BirdSanctuaryException e3){
            e3.printStackTrace();
        }

        try {
            birdSanctuaryManager.add(parrot4);
        }catch (BirdSanctuaryException e4){
            e4.printStackTrace();
        }



        try {
            birdSanctuaryManager.add(duck1);
        }catch (BirdSanctuaryException e4){
            e4.printStackTrace();
        }
        try {
            birdSanctuaryManager.add(duck2);
        }catch (BirdSanctuaryException e5){
            e5.printStackTrace();
        }
        try {
            birdSanctuaryManager.add(duck3);
        }catch (BirdSanctuaryException e6){
            e6.printStackTrace();
        }


        try {
            birdSanctuaryManager.add(penguin1);
        }catch (BirdSanctuaryException e7){
            e7.printStackTrace();
        }
        try {
            birdSanctuaryManager.add(penguin2);
        }catch (BirdSanctuaryException e8){
            e8.printStackTrace();
        }
        try {
            birdSanctuaryManager.add(penguin3);
        }catch (BirdSanctuaryException e9){
            e9.printStackTrace();
        }

        birdSanctuaryManager.remove(parrot1);
        birdSanctuaryManager.remove(parrot2);

        birdSanctuaryManager.print();
        birdSanctuaryManager.printFlyables();
        birdSanctuaryManager.printSwimmable();
        birdSanctuaryManager.printEatable();

        System.out.println("Parrot count:"+Parrot.count);
        System.out.println("Duck count:"+Duck.count);
        System.out.println("Penguin count:"+Penguin.count);
        System.out.println("Total birds:"+Birds.totalCount);
    }
}
