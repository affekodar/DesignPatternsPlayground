package Facade.Video;

import java.util.ArrayList;

public class ZooKeepingFacade {

    private CleaningService cleaningService = new CleaningService();
    private FoodService foodService = new FoodService();
    private WaterService waterService = new WaterService();

    public void handleAnimals(ArrayList<Animal> animals) {
        for (Animal animal: animals) {
            this.cleaningService.clean(animal);
            this.foodService.feed(animal);
            this.waterService.serveWater(animal);
        }
    }
}
