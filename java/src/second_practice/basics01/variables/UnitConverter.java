package second_practice.basics01.variables;

public class UnitConverter {
    public static void main(String[] args) {
        double celciusTemp = 36.6;
        double kilometersCount = 10.0;
        float mile = 1.60934f;

        double toFarenheit = (celciusTemp * 9.0) / 5.0 + 32;
        float milesCount = 10 / mile;

        System.out.println("Температура в Градусах Цельсия: " + celciusTemp + "/" + "Температура в Фаренгейтах: " + toFarenheit + "\n"
                            + "Расстояние в километрах: " + kilometersCount + "km/" + "Расстояние в милях: " + milesCount + "mi");

    }
}