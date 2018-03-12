import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Stream;

public class Ex03_FoldAndSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] input = Arrays.stream(scanner.nextLine()
                .split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();

        int k = input.length / 4;

        int[] upperRow = new int[k * 2];
        int[] lowerRow = new int[k * 2];

        for (int i = 0; i < k; i++) {
            upperRow[i] = input[k - i - 1];
            upperRow[upperRow.length - i - 1] = input[input.length - k + i];
            lowerRow[2 * i] = input[2 * i + k];
            lowerRow[2 * i + 1] = input[2 * i + k + 1];
        }

        int[] result = new int[k * 2];

        for (int i = 0; i < result.length; i++) {
            result[i] = upperRow[i] + lowerRow[i];
        }

        String toBePrinted = Arrays.toString(result);
        System.out.println(toBePrinted.replaceAll("\\[|\\]", "").replaceAll(", ", " "));

    }
}
