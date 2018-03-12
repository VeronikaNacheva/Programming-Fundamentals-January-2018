import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P11_GeometryCalculator {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String figureType = reader.readLine().toLowerCase();

        if ("triangle".equals(figureType)) {
            double side = Double.parseDouble(reader.readLine());
            double height = Double.parseDouble(reader.readLine());
            System.out.printf("%.2f", calculateTriangleArea(side, height));
        } else if ("square".equals(figureType)) {
            double side = Double.parseDouble(reader.readLine());
            System.out.printf("%.2f", calculateSquareArea(side));
        } else if ("rectangle".equals(figureType)) {
            double width = Double.parseDouble(reader.readLine());
            double height = Double.parseDouble(reader.readLine());
            System.out.printf("%.2f", calculateRectangleArea(width, height));
        } else {
            double radius = Double.parseDouble(reader.readLine());
            System.out.printf("%.2f", calculateCircleArea(radius));
        }
    }

    public static double calculateTriangleArea(double side, double height) {
        double area = (side * height) / 2;

        return area;
    }

    public static double calculateSquareArea(double side) {
        double area = side * side;

        return area;
    }

    public static double calculateRectangleArea(double width, double height) {
        double area = width * height;

        return area;
    }

    public static double calculateCircleArea(double radius) {
        double area = Math.PI * radius * radius;

        return area;
    }
}
