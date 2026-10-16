package alloop.advanced.practice;

import alloop.advanced.practiceAbstract.BaseDevice;

public class Light extends BaseDevice {
    private int brightness;

    public Light(String id, String name, boolean isOn, int brightness) {
        super(id, name, isOn);
        this.brightness = brightness;
    }

    public void setBrightness(int brightness) {
        this.brightness = brightness;
    }

    @Override
    public String getDeviceInfo() {
        return super.getDeviceInfo() + ", Brightness: " + brightness + "%";
    }
}