package AbstractFactory.Task;

public class Client {
    private GUIFactory factory;

    public Client(GUIFactory factory) {
        this.factory = factory;
    }

    public void createGUI() {
        Button button = factory.createButton();
        Checkbox checkbox = factory.createCheckBox();

        button.render();
        checkbox.render();
    }

}
