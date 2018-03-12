import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P07_ExchangeVariableVal {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());

        int exchangeA = b;
        int exchangeB = a;

        System.out.println("Before:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("After:");
        System.out.println("a = " + exchangeA);
        System.out.println("b = " + exchangeB);
    }
}
