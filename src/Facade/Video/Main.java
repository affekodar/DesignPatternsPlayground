package Facade.Video;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<Animal> animals = new ArrayList<>();
        animals.add(new Animal("Tiger"));
        animals.add(new Animal("Lion"));
        animals.add(new Animal("Snake"));
        animals.add(new Animal("Monkey"));
        animals.add(new Animal("Bird"));

        ZooKeepingFacade zooKeepingFacade = new ZooKeepingFacade();
        zooKeepingFacade.handleAnimals(animals);
    }
}
