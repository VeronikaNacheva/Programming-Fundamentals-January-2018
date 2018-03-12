import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;
import java.util.ArrayList;

public class Lab03_MinMaxSumAverage {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int count = Integer.parseInt(reader.readLine());

        ArrayList<Integer> numbers = new ArrayList<>();

        for (int i = 0; i < count; i++) {
            int inputNumber = Integer.parseInt(reader.readLine());
            numbers.add(inputNumber);
        }

        int sum = numbers.stream()
                .mapToInt(Integer::intValue)
                .sum();

        int min = numbers.stream()
                .mapToInt(Integer::intValue)
                .min()
                .getAsInt();

        int max = numbers.stream()
                .mapToInt(Integer::intValue)
                .max()
                .getAsInt();

        double average = numbers.stream()
                .mapToInt(Integer::intValue)
                .average()
                .getAsDouble();

        DecimalFormat df = new DecimalFormat("#.#####");

        System.out.printf("Sum = %d%n", sum);
        System.out.printf("Min = %d%n", min);
        System.out.printf("Max = %d%n", max);
        System.out.printf("Average = %s%n", df.format(average));
    }
}
