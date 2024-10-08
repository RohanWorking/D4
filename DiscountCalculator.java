import java.util.Scanner;

public class DiscountCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the purchase amount: ");
        double purchaseAmount = scanner.nextDouble();

        double discount = (purchaseAmount >= 500) ? 0.20 : 0.10;
        double discountAmount = purchaseAmount * discount;
        double finalAmount = purchaseAmount - discountAmount;

        System.out.println("Discount applied: " + (discount * 100) + "%");
        System.out.println("Discount amount: $" + discountAmount);
        System.out.println("Final amount after discount: $" + finalAmount);

        scanner.close();
    }
}
