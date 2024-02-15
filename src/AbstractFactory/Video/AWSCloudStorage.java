package AbstractFactory.Video;

import java.util.HashMap;

public class AWSCloudStorage implements CloudStorage{
    HashMap<Long, double[]> internalStorage = new HashMap<>();

    @Override
    public boolean storeData(Long id, double[] data) {
        internalStorage.put(id, data);
        return true;
    }

    @Override
    public double[] readData(Long id) {
        return internalStorage.get(id);
    }
}
