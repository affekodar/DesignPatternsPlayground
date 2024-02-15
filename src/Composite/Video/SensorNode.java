package Composite.Video;

import java.util.Random;

public class SensorNode extends Node{
    private double temperature;
    public SensorNode(String name) {
        super(name);
        this.temperature = new Random().nextDouble()*50;
    }

    @Override
    double getTemperature() {
        return temperature;
    }
}
