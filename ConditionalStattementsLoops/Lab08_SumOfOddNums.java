import java.util.Scanner;

public class Lab08_SumOfOddNums {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        System.out.println(1);
        int num = 1;
        int sum = 0;
        for (int i = 1; i <= n-1; i++) {
            num += 2;
            System.out.println(num);
            sum += num;
        }
        System.out.printf("Sum: %d", sum + 1);
    }
}
