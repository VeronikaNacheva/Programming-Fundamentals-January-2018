import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P06_StringAndObject {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String first = reader.readLine();
        String second = reader.readLine();

        Object concat = first + " " + second;

        System.out.println(concat);
    }
}
