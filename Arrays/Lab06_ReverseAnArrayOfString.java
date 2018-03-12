import java.util.Arrays;
import java.util.Scanner;

public class Lab06_ReverseAnArrayOfString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] words = scanner.nextLine().split("\\s+");

        for (int i = words.length - 1; i >= 0; i--) {
            System.out.print(words[i] + " ");
        }
    }
}
