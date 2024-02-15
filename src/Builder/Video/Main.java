package Builder.Video;

import org.w3c.dom.ls.LSOutput;

public class Main {
    public static void main(String[] args) {


    CarBuilder builder = new CarBuilder();
    Car car = builder
            .addColor("Orange")
            .addBrand(null)
            .addMaxSpeed(50)
            .build();

        System.out.println("Car created: " + car.getBrand() + ", " + car.getColor() + ", " + car.getMaxSpeed() + " Km/h");
}
}
