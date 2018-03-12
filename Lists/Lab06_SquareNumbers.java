import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Lab06_SquareNumbers {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        DecimalFormat df = new DecimalFormat("#.###");

        int[] numsArr = Arrays.stream(reader.readLine()
                .split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();

        List<Integer> numsList = Arrays.stream(numsArr).boxed().collect(Collectors.toList());

        List<Integer> result = new ArrayList<>();

        for (Integer num : numsList) {
            if (Math.sqrt(num) % 1 == 0) {
                result.add(num);
            }
        }
        Collections.sort(result);
        Collections.reverse(result);

        List<String> stringNums = new ArrayList<>();
        for (Integer a : result) {
            stringNums.add(String.valueOf(a));
        }

        System.out.println(String.join(" ", stringNums));
    }
}
