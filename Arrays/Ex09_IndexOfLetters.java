import java.util.Scanner;

public class Ex09_IndexOfLetters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char[] word = scanner.nextLine().toCharArray();

        for (int i = 0; i < word.length; i++) {
            System.out.printf("%c -> %d%n", word[i], word[i] - 'a');
        }
    }
}
