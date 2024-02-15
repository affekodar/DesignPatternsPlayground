package Observer.Video;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

public class TrafficControl implements PropertyChangeListener {
    @Override
    public void propertyChange(PropertyChangeEvent evt) {
        System.out.println("Traffic control detected change in: " + evt.getPropertyName() + ": " + evt.getNewValue() );
    }
}
