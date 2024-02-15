package Composite.Video;

public class RegionNode extends Node{

    public RegionNode(String name) {
        super(name);
    }
    @Override
    double getTemperature() {
        double temperature = 0.0;
        for (Node node : getChildren()) {
            temperature += node.getTemperature();
        }
        return temperature/getChildren().size();
    }
}
