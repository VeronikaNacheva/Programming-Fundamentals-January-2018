import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class P06_SumReversedNumbers {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int[] inputArr = Arrays.stream(reader.readLine()
                .split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();

        int sum = 0;

        for (int i = 0; i < inputArr.length; i++) {
            int reverse = 0;
            while (inputArr[i] > 0) {
                int r = inputArr[i] % 10;
                reverse = reverse * 10 + r;
                inputArr[i] = inputArr[i] / 10;
            }
            sum += reverse;
        }
        System.out.println(sum);
    }
}
