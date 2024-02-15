package Adapter.Task;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

public class CurrentLogger implements Logger {
    private int fileCounter = 0;
    @Override
    public void log(String str) {
        try {
            File file = new File("file_" + fileCounter + ".txt");
            fileCounter++;

            FileWriter writer = new FileWriter(file);
            writer.write(str);

            writer.close();

            System.out.println(file.getName() + " är skapad.");
            System.out.println(str);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
