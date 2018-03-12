import java.util.Scanner;

public class Lab02_ReverseAnArrayOfInteger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int[] nArrays = new int[n];

        int numbers = 0;
        for (int i = 0; i < nArrays.length; i++) {
            numbers = Integer.parseInt(scanner.nextLine());

            nArrays[i] = numbers;
        }

        for (int i = nArrays.length - 1; i >= 0; i--) {
            System.out.print(nArrays[i] + " ");
        }
    }
}
