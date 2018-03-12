import java.io.BufferedReader;
import java.io.Console;
import java.io.IOException;
import java.io.InputStreamReader;

public class Lab09_RafactorSpecialNumbers {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(reader.readLine());

        int sum = 0;
        int digit = 0;
        boolean specialNum = false;

        for (int i = 1; i <= n; i++) {
            sum = 0;
            digit = i;

            while (digit > 0) {
                sum += digit % 10;
                digit = digit / 10;
            }

            specialNum = (sum == 5) || (sum == 7) || (sum == 11);

            if (specialNum) {
                System.out.printf("%d -> True%n", i);
            } else {
                System.out.printf("%d -> False%n", i);
            }
        }
    }
}
