import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;

public class P08_CenterPoint {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));


        double x1 = Double.parseDouble(reader.readLine());
        double y1 = Double.parseDouble(reader.readLine());
        double x2 = Double.parseDouble(reader.readLine());
        double y2 = Double.parseDouble(reader.readLine());

        System.out.println(pointToCenter(x1, y1, x2, y2));
    }

    public static String pointToCenter(double x1, double y1, double x2, double y2) {
        DecimalFormat df = new DecimalFormat("#.#########");
        String coordinates = "";

        if (Math.pow(x1, 2) + Math.pow(y1, 2) <= Math.pow(x2, 2) + Math.pow(y2, 2)) {
            coordinates = String.format("(%s, %s)", df.format(x1), df.format(y1));
        } else {
            coordinates = String.format("(%s, %s)", df.format(x2), df.format(y2));
        }
        return coordinates;
    }
}
