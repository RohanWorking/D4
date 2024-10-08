import java.util.Scanner;

public class MonthName {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter month number (1-12): ");
        int monthNumber = scanner.nextInt();

        if (monthNumber < 1 || monthNumber > 12) {
            System.out.println("Invalid input! Month number must be between 1 and 12.");
        } else {
            String monthName = switch (monthNumber) {
                case 1 -> "Jan";
                case 2 -> "Feb";
                case 3 -> "Mar";
                case 4 -> "Apr";
                case 5 -> "May";
                case 6 -> "Jun";
                case 7 -> "Jul";
                case 8 -> "Aug";
                case 9 -> "Sep";
                case 10 -> "Oct";
                case 11 -> "Nov";
                case 12 -> "Dec";
                default -> "Invalid"; 
            };

            System.out.println("The month is: " + monthName);
        }

        scanner.close();
    }
}
