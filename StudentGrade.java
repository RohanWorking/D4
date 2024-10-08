import java.util.Scanner;

public class StudentGrade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter student's percentage: ");
        double percentage = scanner.nextDouble();

        if (percentage >= 90) {
            System.out.println("Grade A");
        } else if (percentage >= 80) {
            System.out.println("Grade B");
        } else if (percentage >= 70) {
            System.out.println("Grade C");
        } else {
            System.out.println("Grade D");
        }

        scanner.close();
    }
}
