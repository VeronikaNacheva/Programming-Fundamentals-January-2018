import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Lab05_FoldAndSum {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        List<Integer> numbers = Arrays.stream(reader.readLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        int takeElements = numbers.size() / 4;

        List<Integer> leftSide = numbers.stream()
                .limit(takeElements) //takes elements
                .collect(Collectors.toList());

        List<Integer> middleNumbers = numbers.stream()
                .skip(takeElements)
                .limit(2 * takeElements)
                .collect(Collectors.toList());

        List<Integer> rightNumbers = numbers.stream()
                .skip(3 * takeElements)
                .collect(Collectors.toList());

        Collections.reverse(leftSide);
        Collections.reverse(rightNumbers);

        leftSide.addAll(rightNumbers);

        int[] result = new int[2 * takeElements];

        int index = 0;

        for (int i = 0; i < result.length; i++) {
            result[index++] = leftSide.get(i) + middleNumbers.get(i);
        }

        for (int number : result) {
            System.out.printf("%d ", number);
        }
    }
}
