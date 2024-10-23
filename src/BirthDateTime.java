import java.util.Scanner;

public class BirthDateTime {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int year = DevTest.getRangedInt(in, "Enter birth year (1950-2015): ", 1950, 2015);
        int month = DevTest.getRangedInt(in, "Enter birth month (1-12): ", 1, 12);
        int hour = DevTest.getRangedInt(in, "Enter birth hour (1-24): ", 1, 24);
        int minutes = DevTest.getRangedInt(in, "Enter birth minute (1-59): ", 1, 59);
        int day;

        switch (month) {
            case 4:
            case 6:
            case 9:
            case 11:
                day = DevTest.getRangedInt(in, "Enter birth day (1-30): ", 1, 30);
                break;
            case 2:
                day = DevTest.getRangedInt(in, "Enter birth day (1-29): ", 1, 29);
                break;
            default:
                day = DevTest.getRangedInt(in, "Enter birth day (1-31): ", 1, 31);
                break;
        }

        System.out.println("You entered: " + year + "-" + month + "-" + day + " " + hour + ":" + minutes);
    }
}