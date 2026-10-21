package second_practice.basics01.variables;

public class RestaurantBillCalculator {
    public static void main(String[] args) {
        double orderNoTax = 150.0;
        double orderTaxPercent = 15.0;
        double orderFeePercent = 10.0;
        int peopleCount = 4;

        double orderTax = orderNoTax * (orderTaxPercent / 100.0);
        double orderFee = orderTax * (orderFeePercent / 100.0);
        double orderTotal = orderNoTax + orderTax + orderFee;
        double personTotal = orderTotal / peopleCount;

        System.out.println("=== Ресторан === \n"
                            + "Сумма чека(без налога,чаевых): " + orderNoTax + " BYN \n"
                            + "Процент налога: " + orderTaxPercent + "% (" + orderTax + " BYN) \n"
                            + "Процент чаевых: " + orderFeePercent + "% (" + orderFee + " BYN) \n"
                            + "Количество персон: " + peopleCount + "\n"
                            + "=== \t\t === \n"
                            + "Сумма чека: " + orderTotal + "BYN \n"
                            + "Сумма на каждого человека: " + personTotal + "BYN \n");
    }
}