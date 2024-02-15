package Singleton;

public class Main {


    public static void main(String[] args) {
        String fileName = "C:\\Users\\alfon\\IdeaProjects\\DesignPatternsPlayground\\src\\Singleton\\file.cfg";
        Config config = Config.getInstance(fileName);
        System.out.println("Name: " + config.read("name"));
        config.save("name", "James");
        Config updatedConfig = Config.getInstance(fileName);
        System.out.println("Updated name: " + updatedConfig.read("name"));
    }
}
