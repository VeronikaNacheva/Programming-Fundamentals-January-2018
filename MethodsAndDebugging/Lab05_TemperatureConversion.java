import java.util.Scanner;

public class Lab05_TemperatureConversion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double fahrenheit = Double.parseDouble(scanner.nextLine());

        System.out.printf("%.2f", fahrenheitToCelsius(fahrenheit));

    }

    public static double fahrenheitToCelsius(double fahrenheit) {
        double celsius = ((fahrenheit - 32) * 5) / 9;
        return celsius;
    }
}
