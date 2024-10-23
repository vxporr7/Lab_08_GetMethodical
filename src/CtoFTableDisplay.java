public class CtoFTableDisplay {
    public static void main(String[] args) {
        System.out.printf("%-10s %-10s%n", "Celsius", "Fahrenheit");

        for (double i = -100; i <= 100; i++) {
            System.out.printf("%-10.2f %-10.2f%n", i, CtoF(i));
        }
    }

    public static double CtoF(double cel) {
        return (cel * 9 / 5) + 32;
    }
}
