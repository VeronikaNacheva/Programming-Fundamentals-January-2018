import java.text.DecimalFormat;
import java.util.Scanner;

public class Lab07_MathPower {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.#######");

        double num = Double.parseDouble(scanner.nextLine());
        double pow = Double.parseDouble(scanner.nextLine());

        double numPow = power(num, pow);
        System.out.printf("%s", df.format(numPow));
    }

    public static double power(double num, double pow) {
        double result = 1;

        for (int i = 0; i < pow; i++) {
            result = result * num;
        }
        return result;
    }
}
