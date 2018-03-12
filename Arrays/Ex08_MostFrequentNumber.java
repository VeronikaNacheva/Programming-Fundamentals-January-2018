import java.util.Arrays;
import java.util.Scanner;

public class Ex08_MostFrequentNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] number = Arrays.stream(scanner.nextLine()
                .split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();

        int bestCount = 0;
        int mostFrequentNumber = number[0];

        for (int i = 0; i < number.length; i++) {
            int counter = 0;
            for (int j = i + 1; j < number.length; j++) {
                if (number[i] == number[j]) {
                    counter++;
                }
            }
            if (counter > bestCount) {
                bestCount = counter;
                mostFrequentNumber = number[i];
            }
        }
        System.out.println(mostFrequentNumber);
    }
}
