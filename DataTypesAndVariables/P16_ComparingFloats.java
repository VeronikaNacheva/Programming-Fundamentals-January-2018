import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P16_ComparingFloats {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        double first = Double.parseDouble(reader.readLine());
        double second = Double.parseDouble(reader.readLine());

        double diff = Math.abs(first - second);

        boolean isEqual = diff < 0.000001;

        if (isEqual) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}
