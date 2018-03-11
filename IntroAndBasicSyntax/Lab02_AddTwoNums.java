import java.util.Scanner;

public class Lab02_AddTwoNums {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstNum = Integer.parseInt(scanner.nextLine());
        int secondNum = Integer.parseInt(scanner.nextLine());

        int sum = firstNum + secondNum;
        System.out.printf("%d + %d = %d", firstNum, secondNum, sum);
    }
}
