import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Lab05_SortNumbersSTREAM {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        double[] numbersArr = Arrays.stream(reader.readLine()
                .split("\\s+"))
                .mapToDouble(Double::parseDouble)
                .toArray();

        List<Double> numsList = Arrays.stream(numbersArr).boxed().collect(Collectors.toList());
        Collections.sort(numsList);

        List<String> strings = numsList.stream().map(Object::toString).collect(Collectors.toList());

        System.out.println(String.join(" <= ", strings));

    }
}
