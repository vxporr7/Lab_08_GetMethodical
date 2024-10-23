import java.util.Scanner;

public class FavNumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int num = DevTest.getInt(in, "Enter your favorite int: ");
        double doub = DevTest.getDouble(in, "Enter your favorite double: ");

        System.out.println("Your favorite int: " + num);
        System.out.println("Your favorite double: " + doub);
    }
}