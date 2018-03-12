import java.util.Arrays;
import java.util.Scanner;

public class Ex11_EqualSums {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] input = Arrays.stream(scanner.nextLine()
                .split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();

        boolean isEqualSum = false;
        for (int i = 0; i < input.length; i++) {
            int[] leftSide = Arrays.stream(input).limit(i).toArray();
            int[] rightSide = Arrays.stream(input).skip(i + 1).toArray();

            if (Arrays.stream(leftSide).sum() == Arrays.stream(rightSide).sum()) {
                System.out.println(i);
                isEqualSum = true;
                break;
            }
        }

        if (!isEqualSum) {
            System.out.println("no");
        }
    }
}
