import java.util.Scanner;

public class Lab04_DrowAFilledSquare {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        header(n);
        body(n);
        header(n);
    }

    public static void header(int n) {
        System.out.println(repeatString("-", 2 * n));
    }

    public static void body(int n) {

        for (int i = 0; i < n - 2; i++) {
            System.out.println("-" + repeatString("\\/", n - 1) + "-");
        }
    }

    public static String repeatString(String toReapeat, int count) {
        String text = "";
        for (int i = 0; i < count; i++) {
            text += toReapeat;
        }
        return text;
    }
}
