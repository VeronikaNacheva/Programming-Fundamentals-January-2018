import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;

public class P12_RectangleProperties {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        DecimalFormat df = new DecimalFormat("#.#############");

        double width = Double.parseDouble(reader.readLine());
        double height = Double.parseDouble(reader.readLine());

        double perimeter = 2 * (width + height);
        double area = width * height;
        double diagonal = Math.sqrt(width * width + height * height);

        System.out.println(df.format(perimeter));
        System.out.println(df.format(area));
        System.out.println(df.format(diagonal));
    }
}
