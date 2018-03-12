import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Lab04_SplitByWordCasing {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();
        String[] splitted = text.split("[.!,/()'\\\\\";:\\[\\] ]");

        List<String> lowerCase = new ArrayList<>();
        List<String> mixedCase = new ArrayList<>();
        List<String> upperCase = new ArrayList<>();

        for (String word : splitted) {
            int wordLength = word.length();
            int lowerCount = 0;
            int upperCount = 0;
            for (int i = 0; i < word.length(); i++) {

                if (Character.isLowerCase(word.charAt(lowerCount))) {
                    lowerCount++;
                    if (lowerCount == wordLength) {
                        lowerCase.add(word);
                    }
                } else if (Character.isUpperCase(word.charAt(upperCount))) {
                    upperCount++;
                    if (upperCount == wordLength) {
                        upperCase.add(word);
                    }
                } else {
                    mixedCase.add(word);
                    break;
                }
            }
        }

        System.out.println("Lower-case: " + String.join(", ", lowerCase));
        System.out.println("Mixed-case: " + String.join(", ", mixedCase));
        System.out.println("Upper-case: " + String.join(", ", upperCase));
    }
}
