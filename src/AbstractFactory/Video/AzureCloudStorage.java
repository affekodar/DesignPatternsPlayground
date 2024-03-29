package AbstractFactory.Video;

import java.util.HashMap;

public class AzureCloudStorage implements CloudStorage{

    HashMap<Long, double[]> internalStorage = new HashMap<>();
    @Override
    public boolean storeData(Long id, double[] data) {
        internalStorage.put(id, data);
        //TODO logic to validate storage success
        return true;
    }

    @Override
    public double[] readData(Long id) {
        return internalStorage.get(id);
    }
}
