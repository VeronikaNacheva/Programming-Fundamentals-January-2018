import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class P06_SumReversedNumSTREAM {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        long result = Arrays.stream(reader.readLine().split(" "))
                .map(text-> new StringBuilder(text).reverse().toString())
                .mapToInt(Integer::valueOf).sum();

        System.out.println(result);
    }
}
