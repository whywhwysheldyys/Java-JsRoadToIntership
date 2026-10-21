package second_practice.basics01.arrays;

public class TemperatureAnalyzer {
    public static void main(String[] args) {
        double[] temperatures = {22.5, 24.0, 19.5, 26.5, 28.0, 23.0, 21.0};

        double sum = 0;
        double averageTemp = 0;
        for (int i = 0; i < temperatures.length; i++) {
            sum += temperatures[i];
        }

        averageTemp = sum / temperatures.length;

        for (int i = 0; i < temperatures.length; i ++) {
            if (temperatures[i] > averageTemp) {
                System.out.printf("День %d: температура %.2f (выше средней)\n",(i + 1),  temperatures[i]);
            }
        }
    }
}