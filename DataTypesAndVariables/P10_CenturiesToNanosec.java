import java.io.BufferedReader;
import java.io.Console;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class P10_CenturiesToNanosec {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int centuries = Integer.parseInt(reader.readLine());

        int years = centuries * 100;
        int days = (int) (years * 365.2422);
        long hours = days * 24;
        long minutes = hours * 60;
        long seconds = minutes * 60;
        long milliSeconds = seconds * 1000;

        BigInteger microSeconds = BigInteger.valueOf(milliSeconds).multiply(new BigInteger("1000"));
        BigInteger nanoSeconds = microSeconds.multiply(new BigInteger("1000"));

        System.out.printf("%d centuries = %d years " +
                        "= %d days = %d hours " +
                        "= %d minutes = %d seconds " +
                        "= %d milliseconds = %s microseconds " +
                        "= %s nanoseconds",
                centuries, years, days, hours, minutes, seconds, milliSeconds, microSeconds, nanoSeconds);
    }
}
