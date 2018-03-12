import java.io.BufferedReader;
import java.io.Console;
import java.io.IOException;
import java.io.InputStreamReader;

public class Lab05_SpecialNumbers {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(reader.readLine());

        for (int i = 1; i <= n; i++) {
            int sum = 0;
            int digit = i;

            while (digit > 0) {
                sum += digit % 10;
                digit = digit / 10;
            }

            boolean specialNum = (sum == 5) || (sum == 7) || (sum == 11);
            System.out.printf("%d -> %s%n", i, specialNum);
        }
    }
}
