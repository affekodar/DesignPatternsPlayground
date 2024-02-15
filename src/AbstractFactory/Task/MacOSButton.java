package AbstractFactory.Task;

public class MacOSButton implements Button{
    @Override
    public void render() {
        System.out.println("Rendering MacOS Button");
    }
}
