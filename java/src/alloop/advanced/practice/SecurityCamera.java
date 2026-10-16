package alloop.advanced.practice;

import alloop.advanced.practiceAbstract.BaseDevice;

public class SecurityCamera extends BaseDevice {
        private boolean isNightVisionEnabled;

        public SecurityCamera(String id, String name, boolean isOn, boolean isNightVisionEnabled) {
            super(id, name, isOn);
            this.isNightVisionEnabled = isNightVisionEnabled;
        }

        public void turnOnNightVision() {
            if (!isNightVisionEnabled) {
                System.out.println("Режим переключения ночного видения включен");
                isNightVisionEnabled = true;
            }
        }
}