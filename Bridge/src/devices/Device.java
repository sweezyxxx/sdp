package devices;

public interface Device {
    void turnOn();
    void turnOff();
    boolean isOn();
    void setVolume(int percent);
    int getVolume();
}
