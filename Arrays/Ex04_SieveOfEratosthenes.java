import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Ex04_SieveOfEratosthenes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        boolean[] prime = new boolean[n + 1];

        for (int i = 0; i < prime.length; i++) {
            prime[i] = true;
        }

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (prime[i]) {

                for (int j = i * i; j < n + 1; j += i) {
                    prime[j] = false;
                }
            }
        }

        ArrayList<Integer> result = new ArrayList<Integer>();
        for (int i = 2; i < prime.length; i++) {
            if (prime[i]) {
                result.add(i);
            }
        }

        String toBePrinted = Arrays.toString(result.toArray());
        System.out.println(toBePrinted.replaceAll("\\[|\\]", "").replaceAll(", ", " "));
    }
}
