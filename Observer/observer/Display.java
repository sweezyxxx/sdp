package observer;

public class Display implements Observer {
    private final String name;

    public Display(String name) {
        this.name = name;
    }

    @Override
    public void update(float temperature) {
        System.out.println(name + " received update: Temperature is now " + temperature + "C");
    }
}
