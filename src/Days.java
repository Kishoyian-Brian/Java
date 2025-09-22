import java.util.Scanner;

public class Days {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number (1–7): ");
        int dayNumber = scanner.nextInt();

        String day = switch (dayNumber) {
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            case 6 -> "Saturday";
            case 7 -> "Sunday";
            default -> "Invalid number! Please enter 1–7.";
        };

        System.out.println(day);

        scanner.close();
    }
}
