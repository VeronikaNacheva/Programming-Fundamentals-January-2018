import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;

public class P09_LongerLine {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        double x1 = Double.parseDouble(reader.readLine());
        double y1 = Double.parseDouble(reader.readLine());
        double x2 = Double.parseDouble(reader.readLine());
        double y2 = Double.parseDouble(reader.readLine());
        double x3 = Double.parseDouble(reader.readLine());
        double y3 = Double.parseDouble(reader.readLine());
        double x4 = Double.parseDouble(reader.readLine());
        double y4 = Double.parseDouble(reader.readLine());

        checkAndPrintDistance(x1, y1, x2, y2, x3, y3, x4, y4);
    }

    public static double distance(double x, double y) {
        double distance = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));

        return distance;
    }

    public static void checkAndPrintDistance
            (double x1, double y1, double x2, double y2, double x3, double y3, double x4, double y4) {
        DecimalFormat df = new DecimalFormat("#.##########");

        double distancePoint1 = distance(x1, y1);
        double distancePoint2 = distance(x2, y2);
        double distancePoint3 = distance(x3, y3);
        double distancePoint4 = distance(x4, y4);

        double lengthPoint12 = Math.sqrt(Math.pow((x1 - x2), 2) + Math.pow((y1 - y2), 2));
        double lengthPoint34 = Math.sqrt(Math.pow((x3 - x4), 2) + Math.pow((y3 - y4), 2));

        if (lengthPoint12 >= lengthPoint34) {
            if (distancePoint1 <= distancePoint2) {
                System.out.printf("(%s, %s)(%s, %s)", df.format(x1), df.format(y1), df.format(x2), df.format(y2));
            } else {
                System.out.printf("(%s, %s)(%s, %s)", df.format(x2), df.format(y2), df.format(x1), df.format(y1));
            }
        } else {
            if (distancePoint3 <= distancePoint4) {
                System.out.printf("(%s, %s)(%s, %s)", df.format(x3), df.format(y3), df.format(x4), df.format(y4));
            } else {
                System.out.printf("(%s, %s)(%s, %s)", df.format(x4), df.format(y4), df.format(x3), df.format(y3));
            }
        }
    }
}
