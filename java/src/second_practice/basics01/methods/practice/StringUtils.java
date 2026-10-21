package second_practice.basics01.methods.practice;

public class StringUtils {
//    public void isPalindrome(String str) {
//        String reversed = new StringBuilder(str).reverse().toString();
//        if (str.equals(reversed)) {
//            System.out.println("Является палиндромом");
//        } else {
//            System.out.println("Не является палиндромом");
//        }
//    }

      public boolean isPalindrome(String str) {
          String reversed = new StringBuilder(str).reverse().toString();
          return str.equals(reversed);
      }

//    public void repeatString(String str, int count) {
//        for (int i = 1; i <= count; i++) {
//            System.out.println(str);
//        }
//    }

    public String repeatString(String str, int count) {
          String result = "";
        for (int i = 0; i < count; i++) {
            result += str;
        }
        return result;
    }
}