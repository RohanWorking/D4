import java.util.Scanner;

public class SpringSeason {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter month (1-12): ");
        int month = scanner.nextInt();

        System.out.print("Enter day (1-30): ");
        int day = scanner.nextInt();

        if (month < 1 || month > 12) {
            System.out.println("Invalid input! Month must be between 1 and 12.");
        } else if (day < 1 || day > 30) {
            System.out.println("Invalid input! Day must be between 1 and 30.");
        } else {
            boolean isSpringSeason = false;

            if ((month == 2 && day >= 12) || (month == 3) || (month == 4 && day <= 11)) {
                isSpringSeason = true;
            }

            System.out.println(isSpringSeason);
        }

        scanner.close();
    }
}
