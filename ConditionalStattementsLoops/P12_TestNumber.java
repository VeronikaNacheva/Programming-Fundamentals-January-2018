import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P12_TestNumber {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int firstNum = Integer.parseInt(reader.readLine());
        int secondNum = Integer.parseInt(reader.readLine());
        int max = Integer.parseInt(reader.readLine());

        int result = 0;
        int counter = 0;
        for (int i = firstNum; i >= 1; i--) {
            for (int j = 1; j <= secondNum; j++) {
                counter++;
                result = result + ((i * j) * 3);
                if (result >= max) {
                    break;
                }
            }
            if (result >= max) {
                break;
            }
        }

        if (result >= max) {
            System.out.printf("%d combinations%n", counter);
            System.out.printf("Sum: %d >= %d", result, max);
        } else {
            System.out.printf("%d combinations%n", counter);
            System.out.printf("Sum: %d", result);
        }
    }
}
