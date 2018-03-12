import java.util.Arrays;
import java.util.Scanner;

public class Ex10_PairsByDifference {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] input = Arrays.stream(scanner.nextLine()
                .split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();

        int difference = Integer.parseInt(scanner.nextLine());

        int count = 0;
        for (int i = 0; i < input.length; i++) {
            int currentNum = input[i];
            for (int j = i + 1; j < input.length; j++) {
                int secondNum = input[j];

                if (Math.abs(currentNum - secondNum) == difference) {
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
