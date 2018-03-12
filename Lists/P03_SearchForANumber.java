import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class P03_SearchForANumber {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int[] input = Arrays.stream(reader.readLine()
                .split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();

        List<Integer> numsList = Arrays.stream(input).boxed().collect(Collectors.toList());

        int[] command = Arrays.stream(reader.readLine()
                .split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();

        List<Integer> finalList = new ArrayList<>();

        int takeElements = command[0];
        int deleteElements = command[1];
        int searchNum = command[2];

        for (int i = 0; i < takeElements; i++) {
            finalList.add(numsList.get(i));
        }

        for (int i = 0; i < deleteElements; i++) {
            finalList.remove(0);
        }

        if (finalList.contains(searchNum)) {
            System.out.println("YES!");
        } else {
            System.out.println("NO!");
        }
    }
}
