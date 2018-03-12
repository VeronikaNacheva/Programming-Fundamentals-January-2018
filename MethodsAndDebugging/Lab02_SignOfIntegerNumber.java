import java.util.Scanner;

public class Lab02_SignOfIntegerNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());
        positiveOrNegative(number);
    }

    public static void positiveOrNegative(int n) {
        if (n < 0) {
            System.out.printf("The number %d is negative.", n);
        } else if (n > 0) {
            System.out.printf("The number %d is positive.", n);
        } else {
            System.out.printf("The number %d is zero.", n);
        }
    }
}
