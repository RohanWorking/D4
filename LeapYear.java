import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a year (>= 1582): ");

        String input = scanner.nextLine();

        try {
            int year = Integer.parseInt(input); 

            if (year >= 1582) {
                boolean isLeapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
                
                System.out.println("Is " + year + " a leap year? " + isLeapYear);
            } else {
                System.out.println("The year must be greater than or equal to 1582.");
            }
        } catch (NumberFormatException e) {
            System.out.println("Invalid input! Please enter a valid year.");
        }

        scanner.close();
    }
}
