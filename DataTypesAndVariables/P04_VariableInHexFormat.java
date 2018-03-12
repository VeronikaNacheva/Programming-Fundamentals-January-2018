import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P04_VariableInHexFormat {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String hex = reader.readLine();

        long hexToInt = Long.decode(hex);

        System.out.println(hexToInt);
    }
}
