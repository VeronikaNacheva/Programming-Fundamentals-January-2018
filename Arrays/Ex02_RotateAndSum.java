import java.util.Arrays;
import java.util.Scanner;

public class Ex02_RotateAndSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] nums = Arrays.stream(scanner.nextLine()
                .split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();

        int n = nums.length;

        int rotate = Integer.parseInt(scanner.nextLine());

        int[] sum = new int[nums.length];

        for (int round = 1; round <= rotate; round++) {
            for (int i = 0; i < n; i++) {
                int currentPosition = (i + round) % n;
                sum[currentPosition] += nums[i];
            }
        }
        String toBePrinted = Arrays.toString(sum);
        System.out.println(toBePrinted.replaceAll("\\[|\\]", "").replaceAll(", ", " "));
    }
}
