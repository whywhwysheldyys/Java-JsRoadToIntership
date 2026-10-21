package first_practice.basics01.datatypes;

public class VariablesPractice {
    public static void main(String[] args) {
        int num;
        double numDouble;
        float numFloat = 32f; //при записи float обязательно ставить в конце f
        char letter = 'a';
        boolean isRainNow = true;

        double calcResult = (double) 23 / 32;

        int decr = 1;
        int incr = 1;
        System.out.println(++incr); //вывод 2
        System.out.println(incr++); //вывод 1, следующий вывод будет 2

        System.out.println(--decr); //вывод 0
        System.out.println(decr--); //вывод 1, следующий вывод 0
    }
}
