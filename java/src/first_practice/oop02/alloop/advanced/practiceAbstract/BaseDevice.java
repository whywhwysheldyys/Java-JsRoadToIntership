package first_practice.oop02.alloop.advanced.practiceAbstract;

import first_practice.oop02.alloop.advanced.interfaces.SmartDevice;

public abstract class BaseDevice implements SmartDevice {
    protected String id;
    protected String name;
    protected boolean isOn;

    public BaseDevice(String id, String name, boolean isOn) {
        this.id = id;
        this.name = name;
        this.isOn = isOn;
    }

    @Override
    public void turnOn() {
        this.isOn = true;
    }

    @Override
    public void turnOff() {
        this.isOn = false;
    }

    @Override
    public boolean isOn() {
        return this.isOn;
    }

    public String getDeviceInfo() {
        return "Device: " + name + " (ID: " + id + "), Status: " + (isOn ? "ON" : "OFF");
    }
}