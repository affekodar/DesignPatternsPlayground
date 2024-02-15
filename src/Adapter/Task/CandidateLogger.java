package Adapter.Task;

import java.io.File;
import java.io.FileWriter;
import java.util.Date;

public class CandidateLogger implements BestLogger{
    private int fileCounter = 0;
    @Override
    public void log(String str, Date date) {
        try {
            File file = new File("file_" + fileCounter + ".txt");
            fileCounter++;

            FileWriter writer = new FileWriter(file);
            writer.write(str + new Date().toString());

            writer.close();

            System.out.println(file.getName() + " är skapad.");
            System.out.println(new Date());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
