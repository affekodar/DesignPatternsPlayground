package Observer.Task;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

public class SensorHub implements PropertyChangeListener {
    @Override
    public void propertyChange(PropertyChangeEvent evt) {
        System.out.println("Control detected change in: " + evt.getPropertyName() + ": " + evt.getNewValue());
    }
}
