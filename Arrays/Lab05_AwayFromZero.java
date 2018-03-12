import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Scanner;

public class Lab05_AwayFromZero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.#####");

        double[] nums = Arrays.stream(scanner.nextLine()
                .split(" "))
                .mapToDouble(Double::parseDouble)
                .toArray();

        double res = 0;
        for (int i = 0; i < nums.length; i++) {
            res = Math.abs(nums[i]);
            res = Math.round(res);
            if (nums[i] < 0) {
                res *= -1;
            }
            System.out.printf("%s => %s%n",df.format(nums[i]), df.format(res));
        }
    }
//    public static double myRound(double value) {
//        if (value < 0) {
//            return Math.floor(value);
//        }
//        return Math.round(value);
//    }
}
