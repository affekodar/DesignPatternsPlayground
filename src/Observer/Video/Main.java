package Observer.Video;

public class Main {

    public static void main(String[] args) {
        TrafficControl trafficControl = new TrafficControl();
        Vehicle vehicle = new Vehicle();
        vehicle.addPropertyChangeListener(trafficControl);
        Vehicle vehicle2 = new Vehicle();
        vehicle2.addPropertyChangeListener(trafficControl);
        Vehicle vehicle3 = new Vehicle();
        vehicle3.addPropertyChangeListener(trafficControl);

        vehicle.setSpeed(100);

        vehicle2.setDirection("West");
        vehicle3.setDirection("East");
    }
}
