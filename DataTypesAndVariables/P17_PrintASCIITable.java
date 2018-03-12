import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P17_PrintASCIITable {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int start = Integer.parseInt(reader.readLine());
        int stop = Integer.parseInt(reader.readLine());

        for (int i = start; i <= stop; i++) {
            System.out.printf("%c ", (char) i);
        }
    }
}
