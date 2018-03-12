import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Lab06_TripplesOfLatinLetter {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(reader.readLine());

        for (char i = 'a'; i <= 'a' + (n - 1); i++) {
            for (char j = 'a'; j <= 'a' + (n - 1); j++) {
                for (char k = 'a'; k <= 'a' + (n - 1); k++) {
                    System.out.printf("%c%c%c %n", i, j, k);
                }
            }
        }
    }
}
