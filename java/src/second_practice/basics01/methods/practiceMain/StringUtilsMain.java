package second_practice.basics01.methods.practiceMain;

import second_practice.basics01.methods.practice.StringUtils;

public class StringUtilsMain {
    public static void main(String[] args) {
        StringUtils utils = new StringUtils();

        System.out.println("Является ли палиндромом?" + utils.isPalindrome("шалаш"));
        System.out.println(utils.repeatString("ягоды", 6));
    }
}