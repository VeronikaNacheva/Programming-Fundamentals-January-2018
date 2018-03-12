import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class P07_PrimesInGivenRange {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int start = Integer.parseInt(reader.readLine());
        int stop = Integer.parseInt(reader.readLine());

        List<String> listString = new ArrayList<String>(getPrimeNums(start, stop).size());

        for (int n : getPrimeNums(start, stop)) {
            listString.add(String.valueOf(n));
        }

        System.out.println(String.join(", ", listString));
    }

    public static List<Integer> getPrimeNums(int start, int stop) {
        List result = new ArrayList<Integer>();
        for (int i = start; i <= stop; i++) {
            boolean isPrime = true;
            if (i < 2) {
                isPrime = false;
            }
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                result.add(i);
            }
        }
        return result;
    }
}
