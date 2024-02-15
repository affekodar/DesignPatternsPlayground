package Proxy.Video;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        System.out.println("Utan proxy" + Arrays.toString(new CSVDataFile("example_path").getData()));

        System.out.println("Med proxy" + Arrays.toString(new DataFileProxy("example_path").getData()));
    }
}
