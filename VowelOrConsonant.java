import java.util.Scanner;

public class VowelOrConsonant {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a character: ");
        char ch = scanner.next().toLowerCase().charAt(0);  // Convert to lowercase for uniformity

        switch (ch) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println(ch + " is a vowel.");
                break;
            default:
                if (Character.isLetter(ch)) {
                    System.out.println(ch + " is a consonant.");
                } else {
                    System.out.println("Invalid input! Please enter a letter.");
                }
        }

        scanner.close();
    }
}
