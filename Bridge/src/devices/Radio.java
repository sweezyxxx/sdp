package devices;

public class Radio implements Device {
    private boolean on = false;
    private int volume = 50;

    @Override
    public void turnOn() {
        on = true;
        System.out.println("Radio is turned ON");
    }

    @Override
    public void turnOff() {
        on = false;
        System.out.println("Radio is turned OFF");
    }

    @Override
    public boolean isOn() {
        return on;
    }

    @Override
    public void setVolume(int percent) {
        volume = Math.max(0, Math.min(percent, 100));
        System.out.println("Radio volume set to " + volume + "%");
    }

    @Override
    public int getVolume() {
        return volume;
    }
}
