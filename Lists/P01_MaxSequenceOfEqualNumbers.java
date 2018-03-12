import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class P01_MaxSequenceOfEqualNumbers {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int[] numbersArr = Arrays.stream(reader.readLine()
                .split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();

        List<Integer> numbersList = Arrays.stream(numbersArr).boxed().collect(Collectors.toList());

        int maxNumbers = 0;
        int count = 1;
        int maxCount = 1;
        int currentNumbers = 0;
        while (currentNumbers < numbersList.size() - 1) {

            if (numbersList.get(currentNumbers).equals(numbersList.get(currentNumbers + 1))) {
                count++;

                if (count > maxCount) {
                    maxCount = count;
                    maxNumbers = numbersList.get(currentNumbers);
                }

            } else {
                count = 1;
            }
            currentNumbers++;
            if (maxCount == 1) {
                maxNumbers = numbersList.get(0);
            }
        }

        List<String> result = new ArrayList<>();
        for (int i = 0; i < maxCount; i++) {
            result.add(String.valueOf(maxNumbers));
        }
        System.out.println(String.join(" ", result));
    }
}