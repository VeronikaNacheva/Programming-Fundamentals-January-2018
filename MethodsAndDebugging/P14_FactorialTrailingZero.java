import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class P14_FactorialTrailingZero {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        BigInteger num = new BigInteger(reader.readLine());

        BigInteger factorial = new BigInteger("1");
        do {
            factorial = factorial.multiply(num);
            num = num.subtract(BigInteger.ONE);
        } while (num.compareTo(BigInteger.ZERO) > 0);

        System.out.println(countZeroes(factorial));
    }

    public static int countZeroes(BigInteger n) {
        int countZeroes = 0;
        while (n.mod(BigInteger.TEN).compareTo(BigInteger.ZERO) == 0) {
            n = n.divide(BigInteger.TEN);
            countZeroes++;
        }
        return countZeroes;
    }
}
