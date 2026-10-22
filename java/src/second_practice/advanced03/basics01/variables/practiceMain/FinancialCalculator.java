package second_practice.advanced03.basics01.variables.practiceMain;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class FinancialCalculator {
    public static void main(String[] args) {
        BigDecimal price = new BigDecimal("199.99");
        BigDecimal discountPercent = new BigDecimal("15.5");
        BigDecimal percentHundred = new BigDecimal("100.0");

        BigDecimal discountX = discountPercent.divide(percentHundred, RoundingMode.HALF_UP);
        BigDecimal discountSum = discountX.multiply(price);
        BigDecimal totalPrice = price.subtract(discountSum);
        BigDecimal roundedTotalPrice = totalPrice.setScale(2, RoundingMode.HALF_UP);

        System.out.println("Цена: " + price + "\n"
                            + "Скидка: " + discountPercent + "% \n"
                            + "Итоговая стоимость: " + roundedTotalPrice);
    }
}