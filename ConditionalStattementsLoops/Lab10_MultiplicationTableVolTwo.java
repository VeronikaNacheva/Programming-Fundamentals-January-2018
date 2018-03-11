import java.util.Scanner;

public class Lab10_MultiplicationTableVolTwo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());
        int numTwo = Integer.parseInt(scanner.nextLine());

        if (numTwo > 10) {
            System.out.printf("%d X %d = %d", num, numTwo, num * numTwo);
        } else  {
            for (int i = numTwo; i <= 10; i++) {
                System.out.printf("%d X %d = %d%n", num, i, num * i);
            }
        }
    }
}
