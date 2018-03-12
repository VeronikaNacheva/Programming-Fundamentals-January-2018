import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P14_IntToHexAndBinary {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(reader.readLine());

        String hex = String.format("%X", num);
        String bin = Integer.toBinaryString(num);

        System.out.println(hex);
        System.out.println(bin);
    }
}
