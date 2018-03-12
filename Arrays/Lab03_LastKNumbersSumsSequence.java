import java.util.Scanner;

public class Lab03_LastKNumbersSumsSequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int k = Integer.parseInt(scanner.nextLine());

        long[] nums = new long[n];
        nums[0] = 1;

        for (int i = 1; i < n; i++) {
            long sum = 0;

            for (int j = i - k; j <= i - 1; j++) {
                if (j >= 0) {
                    sum += nums[j];
                }
            }
            nums[i] = sum;
        }

        for (int i = 0; i < n; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}