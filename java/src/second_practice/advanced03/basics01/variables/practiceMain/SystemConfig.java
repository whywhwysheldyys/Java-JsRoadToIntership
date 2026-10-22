package second_practice.advanced03.basics01.variables.practiceMain;

import java.util.Arrays;

public class SystemConfig {
    private final String enviroment;
    private final int[] allowedPorts;

    public SystemConfig(String enviroment, int[] allowedPorts) {
        this.enviroment = enviroment;
        this.allowedPorts = allowedPorts != null ? Arrays.copyOf(allowedPorts, allowedPorts.length) : null;
    }

    public String getEnviroment() {
        return enviroment;
    }

    public int[] getAllowedPorts() {
        return allowedPorts != null ? Arrays.copyOf(allowedPorts, allowedPorts.length) : null;
    }

    public static void main(String[] args) {
        int[] myPorts = {80, 443, 8080};
        SystemConfig config = new SystemConfig("PRODUCTION", myPorts);

        System.out.println("Порты в конфигурации до изменений: " + Arrays.toString(config.getAllowedPorts()));

        myPorts[0] = 3333;
        System.out.println("Внешний массив изменен: " + Arrays.toString(myPorts));
        System.out.println("Порты в конфигурации (не изменились благодаря конструктору): " + Arrays.toString(config.getAllowedPorts()));

        int[] hackedPorts = config.getAllowedPorts();
        hackedPorts[1] = 9999;
        System.out.println("Порты в конфигурации после попытки взлома через геттер (остались прежними благодаря геттеру): " + Arrays.toString(config.getAllowedPorts()));
    }
}