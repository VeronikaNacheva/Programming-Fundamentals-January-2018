import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P09_CountTheIntegers {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int counter = 0;
        while (true) {
            try {
                int num = Integer.parseInt(reader.readLine());
                counter++;

            } catch (Exception exception) {
                break;
            }
        }
        System.out.println(counter);
    }
}
