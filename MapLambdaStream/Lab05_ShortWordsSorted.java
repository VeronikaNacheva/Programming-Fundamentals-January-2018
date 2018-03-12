import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Lab05_ShortWordsSorted {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String[] words = Arrays.stream(reader.readLine().split("[\\\\,:;.!()\"'/\\[\\]\\s+]+"))
                .map(String::toLowerCase)
                .filter(w -> w.length() < 5)
                .sorted()
                .distinct()
                .toArray(String[]::new);

        System.out.println(String.join(", ", words));
    }
}
