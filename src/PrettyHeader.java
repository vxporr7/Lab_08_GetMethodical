import java.util.Scanner;

public class PrettyHeader {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter your message: ");
        String message = in.nextLine();

        prettyHeader(message);
    }

    public static void prettyHeader(String msg) {
        int totalWidth = 60;
        int messageLen = msg.length();
        int padding = (totalWidth - messageLen - 6) / 2; // 6 for the three asterisks on each side

        // Print the top border
        for (int i = 0; i < totalWidth; i++) {
            System.out.print("*");
        }
        System.out.println();

        // Print the message line
        System.out.print("***");
        for (int i = 0; i < padding; i++) {
            System.out.print(" ");
        }
        System.out.print(msg);
        for (int i = 0; i < padding; i++) {
            System.out.print(" ");
        }
        // Adjust for odd-length messages
        if ((messageLen + 6) % 2 != 0) {
            System.out.print(" ");
        }
        System.out.println("***");

        // Print the bottom border
        for (int i = 0; i < totalWidth; i++) {
            System.out.print("*");
        }
        System.out.println();
    }
}