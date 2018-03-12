import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.text.DecimalFormat;

public class Lab02_CircleArea {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        DecimalFormat df = new DecimalFormat("0.000000000000");

        double radius = Double.parseDouble(reader.readLine());

        BigDecimal bigRadius = new BigDecimal(radius);
        BigDecimal circleArea = bigRadius.multiply(bigRadius).multiply(new BigDecimal(Math.PI));

        System.out.println(df.format(circleArea));
    }
}
