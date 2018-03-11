import java.util.Scanner;

public class Lab11_OddNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());

        while (num % 2 == 0){
            System.out.println("Please write an odd number.");
            num = Integer.parseInt(scanner.nextLine());
        }

        System.out.printf("The number is: %d", Math.abs(num));

    }
}
