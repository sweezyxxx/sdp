package Abstract;

public class Main {
    public static void main(String[] args) {
        GUIFactory factory;

        String MyOS = System.getProperty("os.name").toLowerCase();
        if (MyOS.contains("windows")) {
            factory = new WindowsFactory();
        } else {
            factory = new MacFactory();
        }

        Button button = factory.createButton();
        button.render();

        Application app = new Application(factory);
        app.renderUI();
    }
}
