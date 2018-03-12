import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.TreeMap;

public class Lab01_CountRealNumbers {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String[] input = reader.readLine().split(" ");
        double[] inputNumbers = new double[input.length];

        for (int i = 0; i < input.length; i++) {
            inputNumbers[i] = Double.parseDouble(input[i]);
        }

        TreeMap<Double, Integer> map = new TreeMap<>();

        DecimalFormat df = new DecimalFormat("#.#########");

        for (double inputNumber : inputNumbers) {
            if (map.containsKey(inputNumber)) {
                map.put(inputNumber, map.get(inputNumber) + 1);
            } else {
                map.put(inputNumber, 1);
            }
        }

        for (Double number : map.keySet()) {
            System.out.printf("%s -> %d%n", df.format(number), map.get(number));
        }
    }
}
