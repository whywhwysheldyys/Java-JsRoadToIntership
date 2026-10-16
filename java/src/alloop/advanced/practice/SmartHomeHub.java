package alloop.advanced.practice;

import alloop.advanced.exceptions.DeviceNotFoundException;
import alloop.advanced.interfaces.SmartDevice;

import java.util.ArrayList;
import java.util.List;

public class SmartHomeHub {
    private List<SmartDevice> devices;

    public SmartHomeHub() {
        this.devices = new ArrayList<>();
    }

    public void addDevice(SmartDevice device) {
        devices.add(device);
    }

    public void removeDevice(String id) {
        SmartDevice device = getDeviceById(id);
        devices.remove(device);
    }

    public void turnOffAll() {
        for (SmartDevice device : devices) {
            device.turnOff();
        }
    }

    public SmartDevice getDeviceById(String id) {
        for (SmartDevice device : devices) {
            if (device.getDeviceInfo().contains("ID: " + id)) {
                return device;
            }
        }
        throw new DeviceNotFoundException("Устройство с ID " + id + " не найдено.");
    }

    public List<SmartDevice> getAllDevices() {
        return devices;
    }
}