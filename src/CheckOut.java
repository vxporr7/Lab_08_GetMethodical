import java.util.Scanner;

public class CheckOut {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double userPrice = 0;
        boolean playing = true;

        while (playing) {
            userPrice += DevTest.getRangedDouble(in, "Enter price of your item (.50-10.00): ", 0.50, 10.00);
            playing = DevTest.getYNConfirm(in, "Do you want to enter more items (y/n): ");
        }
        System.out.println();
        System.out.printf("Total: $%.2f", userPrice);
    }
}