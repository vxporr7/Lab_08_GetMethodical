import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GetUserName {
    public static void main(String[] args) throws IOException {
        InputStreamReader sr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(sr);
        String username = DevTest.getNonZeroLenString(br, "Enter your username: ");
        System.out.println("You entered: " + username);
    }
}