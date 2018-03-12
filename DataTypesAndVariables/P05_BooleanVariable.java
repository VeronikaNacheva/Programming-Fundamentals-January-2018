import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P05_BooleanVariable {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String trueOrFalse = reader.readLine();

        if ("True".equals(trueOrFalse)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
