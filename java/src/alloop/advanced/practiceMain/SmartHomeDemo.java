package alloop.advanced.practiceMain;

import alloop.advanced.interfaces.SmartDevice;
import alloop.advanced.practice.Light;
import alloop.advanced.practice.SecurityCamera;
import alloop.advanced.practice.SmartHomeHub;
import alloop.advanced.practice.Thermostat;

public class SmartHomeDemo {
    public static void main(String[] args) {
        SmartHomeHub hub = new SmartHomeHub();

        Light light = new Light("L1", "Гостиная", false, 50);
        Thermostat thermostat = new Thermostat("T1", "Теплый пол", true, 21.5);
        SecurityCamera camera = new SecurityCamera("C1", "Двор", false, false);

        hub.addDevice(light);
        hub.addDevice(thermostat);
        hub.addDevice(camera);

        light.turnOn();
        light.setBrightness(90);

        thermostat.setTemperature(23.0);

        camera.turnOnNightVision();

        System.out.println("Список всех устройств:");
        for (SmartDevice device : hub.getAllDevices()) {
            System.out.println(device.getDeviceInfo());
        }

        System.out.println("\nПоиск устройства по ID:");
        SmartDevice foundDevice = hub.getDeviceById("T1");
        System.out.println(foundDevice.getDeviceInfo());

        System.out.println("\nВыключение всех устройств:");
        hub.turnOffAll();
    }
}