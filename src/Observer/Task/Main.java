package Observer.Task;

public class Main {

    public static void main(String[] args) {
        SensorHub sensorHub = new SensorHub();
        Sensor sensor1 = new Sensor();
        sensor1.addPropertyChangeListener(sensorHub);
        Sensor sensor2 = new Sensor();
        sensor2.addPropertyChangeListener(sensorHub);
        Sensor sensor3 = new Sensor();
        sensor3.addPropertyChangeListener(sensorHub);

        sensor1.setTemperature(23);
        sensor2.setPosition("Uppsala");
        sensor3.setTempId("arg12");
    }
}
