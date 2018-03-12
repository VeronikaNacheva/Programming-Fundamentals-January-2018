import java.util.Scanner;

public class P06_PrimeChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        long num = Long.parseLong(scanner.nextLine());

        if (num == 0 || num == 1) {
            System.out.println("False");
        } else if (isPrime(num)) {
            System.out.println("True");
        } else if (!isPrime(num)) {
            System.out.println("False");
        }
    }

    public static boolean isPrime(long num) {
        boolean isPrime = true;

        for (long i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                isPrime = false;
            }
        }
        return isPrime;
    }
}
