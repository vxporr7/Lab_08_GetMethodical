import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.io.BufferedReader;
import java.io.IOException;

public class DevTest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Example usage of getInt
        int anyInt = getInt(in, "Enter any integer: ");
        System.out.println("You entered: " + anyInt);

        // Example usage of getDouble
        double anyDouble = getDouble(in, "Enter any double value: ");
        System.out.println("You entered: " + anyDouble);

        // Example usage of getRangedInt
        int rangedInt = getRangedInt(in, "Enter an integer within the range", 1, 10);
        System.out.println("You entered: " + rangedInt);

        // Example usage of getRangedDouble
        double rangedDouble = getRangedDouble(in, "Enter a double value within the range", 1.0, 10.0);
        System.out.println("You entered: " + rangedDouble);

        // Example usage of getYNConfirm
        boolean confirm = getYNConfirm(in, "Do you want to continue? [y/n]: ");
        System.out.println("You selected: " + (confirm ? "Yes" : "No"));

        // Example usage of getRegExString
        String username = getRegExString(in, "Enter a valid username: ", "^[A-Za-z0-9+_.-]+$");
        System.out.println("You entered: " + username);
    }

    public static int getInt(Scanner pipe, String prompt) {
        int result = 0;
        boolean valid = false;

        do {
            System.out.print(prompt);
            if (pipe.hasNextInt()) {
                result = pipe.nextInt();
                valid = true;
            } else {
                System.out.println("Invalid input. Please enter an integer.");
                pipe.next(); // Clear the invalid input
            }
            pipe.nextLine(); // Clear the buffer
        } while (!valid);

        return result;
    }

    public static double getDouble(Scanner pipe, String prompt) {
        double result = 0.0;
        boolean valid = false;

        do {
            System.out.print(prompt);
            if (pipe.hasNextDouble()) {
                result = pipe.nextDouble();
                valid = true;
            } else {
                System.out.println("Invalid input. Please enter a double value.");
                pipe.next(); // Clear the invalid input
            }
            pipe.nextLine(); // Clear the buffer
        } while (!valid);

        return result;
    }

    public static int getRangedInt(Scanner pipe, String prompt, int low, int high) {
        int result = 0;
        boolean valid = false;

        do {
            System.out.print(prompt + " [" + low + " - " + high + "]: ");
            if (pipe.hasNextInt()) {
                result = pipe.nextInt();
                if (result >= low && result <= high) {
                    valid = true;
                } else {
                    System.out.println("Invalid input. Please enter an integer within the range [" + low + " - " + high + "].");
                }
            } else {
                System.out.println("Invalid input. Please enter an integer.");
                pipe.next(); // Clear the invalid input
            }
            pipe.nextLine(); // Clear the buffer
        } while (!valid);

        return result;
    }

    public static double getRangedDouble(Scanner pipe, String prompt, double low, double high) {
        double result = 0.0;
        boolean valid = false;

        do {
            System.out.print(prompt + " [" + low + " - " + high + "]: ");
            if (pipe.hasNextDouble()) {
                result = pipe.nextDouble();
                if (result >= low && result <= high) {
                    valid = true;
                } else {
                    System.out.println("Invalid input. Please enter a double value within the range [" + low + " - " + high + "].");
                }
            } else {
                System.out.println("Invalid input. Please enter a double value.");
                pipe.next(); // Clear the invalid input
            }
            pipe.nextLine(); // Clear the buffer
        } while (!valid);

        return result;
    }

    public static boolean getYNConfirm(Scanner pipe, String prompt) {
        System.out.print(prompt);
        String input_data = pipe.nextLine().toLowerCase();

        return switch (input_data) {
            case "y" -> true;
            case "n" -> false;
            default -> getYNConfirm(pipe, prompt);
        };
    }

    public static String getRegExString(Scanner pipe, String prompt, String regEx) {
        String input_data;
        boolean valid = false;

        do {
            System.out.print(prompt);
            input_data = pipe.nextLine();

            Pattern pattern = Pattern.compile(regEx);
            Matcher matcher = pattern.matcher(input_data);

            if (matcher.find()) {
                valid = true;
            } else {
                System.out.println("Invalid input. Please enter a string that matches the pattern: " + regEx);
            }
        } while (!valid);

        return input_data;
    }

    public static String getNonZeroLenString(BufferedReader br, String prompt) throws IOException {
        String input_data;
        boolean valid = false;

        do {
            System.out.print(prompt);
            input_data = br.readLine();

            if (input_data != null && !input_data.trim().isEmpty()) {
                valid = true;
            } else {
                System.out.println("Invalid input. Please enter a non-empty string.");
            }
        } while (!valid);

        return input_data;
    }
}
