import java.util.Arrays;
import java.util.Scanner;

public class Ex07_MaxSequenceOfIncreasingElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] input = Arrays.stream(scanner.nextLine()
                .split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();

        int longestSeqLength = 1;
        int longestSeqStart = 0;
        int currentSeqLength = 1;
        int currentSeqStart = 0;

        for (int i = 1; i < input.length; i++) {
            if (input[i] > input[i - 1]) {
                currentSeqLength++;
                if (currentSeqLength > longestSeqLength) {
                    longestSeqLength = currentSeqLength;
                    longestSeqStart = currentSeqStart;
                }
            } else {
                currentSeqLength = 1;
                currentSeqStart = i;
            }
        }

        for (int i = longestSeqStart; i < longestSeqStart + longestSeqLength; i++) {
            System.out.print(input[i] + " ");
        }
    }
}
