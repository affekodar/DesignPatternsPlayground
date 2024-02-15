package Observer.Task;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

public class Sensor {

    private int temperature;
    private String position;
    private String tempId;

    private PropertyChangeSupport propertyChangeSupport;

    public Sensor() {
        this.propertyChangeSupport = new PropertyChangeSupport(this);
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        this.propertyChangeSupport.addPropertyChangeListener(listener);
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        int oldTemp = this.temperature;
        this.temperature = temperature;

        this.propertyChangeSupport.firePropertyChange("temperature", oldTemp, this.temperature);
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        String oldPos = this.position;
        this.position = position;
        this.propertyChangeSupport.firePropertyChange("position", oldPos, this.position);
    }

    public String getTempId() {
        return tempId;
    }

    public void setTempId(String tempId) {
        String oldTempId = this.tempId;
        this.tempId = tempId;
        this.propertyChangeSupport.firePropertyChange("tempId", oldTempId, this.tempId);
    }
}
