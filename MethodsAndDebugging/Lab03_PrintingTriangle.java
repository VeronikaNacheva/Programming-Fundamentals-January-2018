import java.util.Scanner;

public class Lab03_PrintingTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < num; i++) {
            printLine(1, i);
        }

        for (int i = 0; i < 1; i++) {
            printLine(1, num);
        }

        for (int i = num - 1; i >= 0; i--) {
            printLine(1, i);
        }

    }

    public static void printLine(int start, int end) {
        for (int i = start; i <= end; i++) {
            System.out.printf("%d ", i);
        }
        System.out.println();
    }
}
