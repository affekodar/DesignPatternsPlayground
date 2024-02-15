package Builder.Video;

public class CarBuilder {

    private Car car = new Car();


    public CarBuilder addColor(String color) {
        car.setColor(color);
        return this;
    }

    public CarBuilder addBrand(String brand) {
        car.setBrand(brand);
        return this;
    }

    public CarBuilder addMaxSpeed(int speed) {
        if (speed < 50 || speed > 350) {
            throw new RuntimeException("Invalid max speed");
        }
        car.setMaxSpeed(speed);
        return this;
    }

    public Car build() {
        if (car.getBrand() == null) {
            throw new RuntimeException("Brand missing");
        }
        return car;
    }

}
