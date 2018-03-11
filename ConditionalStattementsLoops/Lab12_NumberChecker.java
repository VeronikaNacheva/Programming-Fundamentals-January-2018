import java.util.Scanner;

public class Lab12_NumberChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            int num = Integer.parseInt(scanner.nextLine());
            System.out.println("It is a number.");
        } catch (Exception exception) {
            System.out.println("Invalid input!");
        }
    }
}
