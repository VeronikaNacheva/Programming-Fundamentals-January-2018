import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Lab07_CountNumbers {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int[] numbersArr = Arrays.stream(reader.readLine()
                .split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();

        List<Integer> numbersList = Arrays.stream(numbersArr).boxed().collect(Collectors.toList());

        Collections.sort(numbersList);

        List<Integer> passed = new ArrayList<>();

        for (int i = 0; i < numbersList.size(); i++) {
            if (!passed.contains(numbersList.get(i))) {
                int counter = 0;
                for (int j = 0; j < numbersList.size(); j++) {
                    if (numbersList.get(i).equals(numbersList.get(j))) {
                        counter++;
                    }
                }
                System.out.printf("%d -> %d%n", numbersList.get(i), counter);
                passed.add(numbersList.get(i));
            }
        }
    }
}
