package strings;

public class LoopsPractice {
    public static void main(String[] args) {
        for (int i = 1; i <= 20; i++) {
            if (i % 2 == 0) {
                if (i == 6) {
                    System.out.println("Number skip");
                    continue;
                }
                System.out.println(i);
            }

            if (i == 6) {
                continue;
            }
        }

        int i = 1;
        int sum = 0;
        while(i <= 10) {
            sum += i;
            i++;
        }

        System.out.println(sum);
    }
}