import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P06_IntervalOfNumbers {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int start = Integer.parseInt(reader.readLine());
        int stop = Integer.parseInt(reader.readLine());

        int min = Math.min(start, stop);
        int max = Math.max(start, stop);

        for (int i = min; i <= max; i++) {
            System.out.println(i);
        }
    }
}
