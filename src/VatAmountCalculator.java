import java.util.Scanner;

public class VatAmountCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please Enter a Price..:");
        double price = scanner.nextDouble();
        double vatAmount = calculateVat(price);

        System.out.println("Price without Vat..:" + price);
        System.out.println("Price with Vat..:" + (vatAmount + price));
        System.out.println("VAT Amount..:" + vatAmount);
        /*if (price <= 1000) {
            System.out.println("Your vat amount" + price * vatAmountHigh);
        } else {
            System.out.println("Your paid amount" + price * vatAmountLower);
        }*/

    }

    public static double calculateVat(double price) {
        if (price <= 1000) {
            return (double) Math.round(price * 18) / 100;
        } else {
            return (double) Math.round(price * 8) / 100;
        }
    }
}
