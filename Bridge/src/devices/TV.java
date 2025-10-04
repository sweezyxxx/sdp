package devices;

public class TV implements Device {
    private boolean on = false;
    private int volume = 30;

    @Override
    public void turnOn() {
        on = true;
        System.out.println("TV is turned ON");
    }

    @Override
    public void turnOff() {
        on = false;
        System.out.println("TV is turned OFF");
    }

    @Override
    public boolean isOn() {
        return on;
    }

    @Override
    public void setVolume(int percent) {
        volume = Math.max(0, Math.min(percent, 100));
        System.out.println("TV volume set to " + volume + "%");
    }

    @Override
    public int getVolume() {
        return volume;
    }
}
