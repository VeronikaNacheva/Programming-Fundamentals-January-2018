import java.util.Arrays;
import java.util.Scanner;

public class Ex06_MaxSequenceOfEqualElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] number = Arrays.stream(scanner.nextLine()
                .split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();

        int countMax = 0;
        int startMax = 0;
        int count = 0;

        for (int i = 0; i < number.length - 1; i++) {
            count = 0;
            while (number[i + count] == number[i + 1 + count]) {
                count++;
                if (i + 1 + count > number.length - 1) {
                    break;
                }
            }
            if (count > countMax) {
                countMax = count;
                startMax = i;
            }
        }
        for (int i = startMax; i <= startMax + countMax; i++) {
            System.out.print(number[i] + " ");
        }
        System.out.println();
    }
}
