import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P13_GameOfNumbers {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(reader.readLine());
        int M = Integer.parseInt(reader.readLine());
        int magic = Integer.parseInt(reader.readLine());

        int first = 0;
        int second = 0;
        int sum = 0;
        int counter = 0;

        for (int i = M; i >= N; i--) {
            for (int j = M; j >= N; j--) {
                counter++;
                first = i;
                second = j;
                sum = i + j;

                if (sum == magic) {
                    break;
                }
            }
            if (sum == magic) {

                break;
            }
        }

        if (sum == magic) {
            System.out.printf("Number found! %d + %d = %d", first, second, magic);
        } else {
            System.out.printf("%d combinations - neither equals %d", counter, magic);
        }
    }
}
