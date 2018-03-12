import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class P02_ChangeList {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int[] numbersArr = Arrays.stream(reader.readLine()
                .split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();

        List<Integer> numsList = Arrays.stream(numbersArr).boxed().collect(Collectors.toList());

        String command = "";
        String[] sequence;
        while (!"Even".equals(command) && !"Odd".equals(command)) {
            sequence = reader.readLine().split("\\s+");
            command = sequence[0];
            int value = 0;
            int index = 0;

            if ("Delete".equals(command)) {
                value = Integer.parseInt(sequence[1]);
                numsList.removeAll(Arrays.asList(value));
            } else if ("Insert".equals(command)) {
                value = Integer.parseInt(sequence[1]);
                index = Integer.parseInt(sequence[2]);
                numsList.add(index, value);
            }
        }
        if ("Odd".equals(command)) {
            numsList
                    .stream()
                    .filter(n -> n % 2 != 0)
                    .map(n -> n.toString())
                    .forEach(n -> System.out.printf("%s ", n));
        } else if ("Even".equals(command)) {
            numsList
                    .stream()
                    .filter(n -> n % 2 == 0)
                    .map(n -> n.toString())
                    .forEach(n -> System.out.printf("%s ", n));
        }
    }
}
