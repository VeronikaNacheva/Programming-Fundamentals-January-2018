import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P09_ReverseChar {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        char first = reader.readLine().charAt(0);
        char second = reader.readLine().charAt(0);
        char third = reader.readLine().charAt(0);

        System.out.printf("%c%c%c", third, second, first);
    }
}
