package observer;

public class Main {
    public static void main(String[] args) {
        WeatherStation station = new WeatherStation();

        Display phoneDisplay = new Display("Phone Display");
        Display windowDisplay = new Display("Window Display");

        station.addObserver(phoneDisplay);
        station.addObserver(windowDisplay);

        station.setTemperature(22.5f);
        station.setTemperature(25.0f);

        station.removeObserver(windowDisplay);
        station.setTemperature(27.3f);
    }
}
