package AbstractFactory.Task;

public class Main {
    public static void main(String[] args) {
        Client windowsClient = new Client(new WindowsFactory());
        windowsClient.createGUI();

        Client macOSClient = new Client(new MacOSFactory());
        macOSClient.createGUI();
    }
}
