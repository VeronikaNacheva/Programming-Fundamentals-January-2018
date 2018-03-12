import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Lab03_BigFactorial {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int inputNumber = Integer.parseInt(reader.readLine());
        BigInteger factorial = findFactorial(inputNumber);

        System.out.println(factorial);
    }

    private static BigInteger findFactorial(int inputNumber) {
        BigInteger factorial = BigInteger.valueOf(1);

        for (int i = inputNumber; i >= 1; i--) {
            factorial = factorial.multiply(BigInteger.valueOf(i));
        }

        return factorial;
    }
}
