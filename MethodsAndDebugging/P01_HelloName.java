import java.util.Scanner;

public class P01_HelloName {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        helloName(name);

    }

    public static void helloName(String name) {
        System.out.printf("Hello, %s!", name);
    }
}
