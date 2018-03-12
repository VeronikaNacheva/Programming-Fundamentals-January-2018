import java.util.Scanner;

public class P05_Fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());

        if (num == 0) {
            System.out.println("1");
        } else if (num == 1) {
            System.out.println("1");
        } else {
            int fibNum = fibonacciNumber(num);
            System.out.printf("%d", fibNum);
        }
    }

    public static int fibonacciNumber(int num) {
        int a = 1;
        int b = 1;
        int c = 0;
        for (int i = 2; i <= num; i++) {
            c = a + b;
            a = b;
            b = c;
            if (i == num) {
                return c;
            }
        }
        return 0;
    }
}
