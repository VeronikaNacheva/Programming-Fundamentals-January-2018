import java.util.Scanner;

public class P03_MilesToKm {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double miles = Double.parseDouble(scanner.nextLine());

        double km = miles * 1.60934;

        System.out.printf("%.2f", km);
    }
}
