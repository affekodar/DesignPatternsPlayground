package Adapter.Task;

public class Main {

    public static void main(String[] args) {
        RandomTextGenerator randomTextGenerator = new RandomTextGenerator();
        randomTextGenerator.createString(100, new LoggerAdapter());



    }
}
