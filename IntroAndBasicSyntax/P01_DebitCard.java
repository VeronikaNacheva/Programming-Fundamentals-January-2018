import java.util.Scanner;

public class P01_DebitCard {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int first = Integer.parseInt(scanner.nextLine());
        int second = Integer.parseInt(scanner.nextLine());
        int third = Integer.parseInt(scanner.nextLine());
        int fourth = Integer.parseInt(scanner.nextLine());

        System.out.printf("%04d %04d %04d %04d", first, second, third, fourth);
    }
}
