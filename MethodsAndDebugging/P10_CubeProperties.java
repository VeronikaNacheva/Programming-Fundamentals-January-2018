import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P10_CubeProperties {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        double side = Double.parseDouble(reader.readLine());
        String type = reader.readLine();

        printResult(type, side);
    }

    public static double calculateFace(double side) {
        double face = Math.sqrt(2 * Math.pow(side, 2));

        return face;
    }

    public static double calculateSpace(double side) {
        double space = Math.sqrt(3 * Math.pow(side, 2));

        return space;
    }

    public static double calculateVolume(double side) {
        double volume = Math.pow(side, 3);

        return volume;
    }

    public static double calculateArea(double side) {
        double area = 6 * Math.pow(side, 2);

        return area;
    }

    public static void printResult(String type, double side) {
        switch (type) {
            case "face":
                System.out.printf("%.2f", calculateFace(side));
                break;
            case "space":
                System.out.printf("%.2f", calculateSpace(side));
                break;
            case "volume":
                System.out.printf("%.2f", calculateVolume(side));
                break;
            case "area":
                System.out.printf("%.2f", calculateArea(side));
                break;
        }
    }
}
