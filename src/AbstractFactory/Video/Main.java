package AbstractFactory.Video;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Account account = new Account("Alfons", "azure");
        CloudServiceFactory factory = CloudManager.getFactory(account);
        CloudStorage storage = factory.createStorage();
        storage.storeData(1L, new double[]{1, 2, 3, 4, 5});
        System.out.println(Arrays.toString(storage.readData(1L)));
    }
}
