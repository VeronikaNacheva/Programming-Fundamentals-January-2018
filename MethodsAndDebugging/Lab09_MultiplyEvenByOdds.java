import java.util.Scanner;

public class Lab09_MultiplyEvenByOdds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());
        num = Math.abs(num);

        System.out.println(multiply(num));
    }

    public static int multiply(int num) {

        return getSumOfOdd(num) * getSumOfEven(num);
    }

    public static int getSumOfOdd(int num) {
        int sum = 0;

        while (num > 0) {
            int lastDigit = num % 10;
            if (lastDigit % 2 != 0) {
                sum += lastDigit;
            }
            num /= 10;
        }

        return sum;
    }

    public static int getSumOfEven(int num) {
        int sum = 0;

        while (num > 0) {
            int lastDigit = num % 10;
            if (lastDigit % 2 == 0) {
                sum += lastDigit;
            }
            num /= 10;
        }

        return sum;
    }
}
