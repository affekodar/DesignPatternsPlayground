package AbstractFactory.Video;

public interface CloudStorage {

    boolean storeData(Long id, double[] data);
    double[] readData(Long id);
}
