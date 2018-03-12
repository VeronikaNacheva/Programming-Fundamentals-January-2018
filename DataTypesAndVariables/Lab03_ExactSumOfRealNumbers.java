import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.text.DecimalFormat;

public class Lab03_ExactSumOfRealNumbers {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        DecimalFormat df = new DecimalFormat("#.########################");

        int n = Integer.parseInt(reader.readLine());

        BigDecimal sum = new BigDecimal("0.00");
        for (int i = 0; i < n; i++) {
            BigDecimal number = new BigDecimal(reader.readLine());

            sum = sum.add(number);
        }
        System.out.println(df.format(sum));
    }
}
