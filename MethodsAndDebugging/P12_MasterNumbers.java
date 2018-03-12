import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P12_MasterNumbers {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(reader.readLine());

        for (int i = 1; i <= n; i++) {
            if (isPalindrome(i) && sumOfDigit(i) && containsEvenDigit(i)) {
                System.out.println(i);
            }
        }
    }

    public static boolean isPalindrome(int n) {

        boolean isPalindrome = true;
        String num = String.valueOf(n);

        for (int i = 0; i < num.length(); i++) {
            if (num.charAt(i) != num.charAt(num.length() - i - 1)) {
                isPalindrome = false;
            }
        }
        return isPalindrome;
    }

    public static boolean sumOfDigit(int n) {
        int sum = 0;
        while (n > 0) {
            int digit = n % 10;
            sum += digit;
            n /= 10;
        }

        if (sum % 7 == 0) {
            return true;
        }
        return false;
    }

    public static boolean containsEvenDigit(int n) {

        while (n > 0) {
            int digit = n % 10;
            if (digit % 2 == 0) {
                return true;
            }

            n /= 10;
        }

        return false;
    }
}
