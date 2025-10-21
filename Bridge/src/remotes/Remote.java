package remotes;

import devices.Device;

public abstract class Remote {
    protected Device device;

    protected Remote(Device device) {
        this.device = device;
    }

    public abstract void power();
    public abstract void volumeUp();
    public abstract void volumeDown();
}