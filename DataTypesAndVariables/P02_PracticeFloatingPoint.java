import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;

public class P02_PracticeFloatingPoint {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        BigDecimal first = new BigDecimal(reader.readLine());
        double second = Double.parseDouble(reader.readLine());
        BigDecimal third = new BigDecimal(reader.readLine());

        System.out.println(first);
        System.out.println(second);
        System.out.println(third);
    }
}
