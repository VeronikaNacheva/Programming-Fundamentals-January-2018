import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class P13_Factorial {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        BigInteger num = new BigInteger(reader.readLine());

        System.out.println(factorial(num));
    }

    public static BigInteger factorial(BigInteger n) {
        BigInteger factorial = new BigInteger("1");

        do {
            factorial = factorial.multiply(n);
            n = n.subtract(BigInteger.ONE);
        } while (n.compareTo(BigInteger.ZERO) > 0);

        return factorial;
    }
}
