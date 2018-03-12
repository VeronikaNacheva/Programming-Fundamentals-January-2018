import java.util.Arrays;
import java.util.Scanner;

public class Lab08_Condense {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] nums = Arrays.stream(scanner.nextLine()
                .split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int[] condensed = new int[nums.length - 1];

        if (nums.length == 1) {
            System.out.println(nums[0]);
            return;
        }

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < condensed.length - i; j++) {
                condensed[j] = nums[j] + nums[j + 1];
            }
            nums = condensed;
        }
        System.out.println(nums[0]);
    }
}
