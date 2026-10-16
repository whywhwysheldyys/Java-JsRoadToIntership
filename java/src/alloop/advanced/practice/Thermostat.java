package alloop.advanced.practice;

import alloop.advanced.practiceAbstract.BaseDevice;

public class Thermostat extends BaseDevice {
        private double temperature;

        public Thermostat(String id, String name, boolean isOn, double temperature) {
            super(id, name, isOn);
            this.temperature = temperature;
        }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    @Override
    public String getDeviceInfo() {
        return super.getDeviceInfo() + ", Temperature: " + temperature + "℃";
    }
}