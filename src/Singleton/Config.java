package Singleton;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class Config {

    private static Config instance;
    private Map<String, String> configData;
    private String fileName;

    private Config(String fileName){
        this.fileName = fileName;
        this.configData = readConFile(fileName);
    }

    public static Config getInstance(String fileName) {
        if (instance == null) {
            instance = new Config(fileName);
        }
        return instance;
    }

    public static Map<String, String> readConFile(String fileName) {
        Map<String, String> config = new HashMap<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] names = line.split(":");
                String key = names[0].trim();
                String value = names[1].trim();
                config.put(key, value);

            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return config;
    }

    public String read(String key) {
        return configData.get(key);
    }

    public void save(String key, String value) {
        configData.put(key, value);
        writeConfigFile();

    }

    private void writeConfigFile() {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            for (Map.Entry<String, String> entry : configData.entrySet()) {
                writer.write(entry.getKey() + ": " + entry.getValue());
                writer.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
