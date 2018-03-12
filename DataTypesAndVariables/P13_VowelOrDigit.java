import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P13_VowelOrDigit {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        char vowel = reader.readLine().charAt(0);

        boolean isVowel = "aeiou".indexOf(vowel) >= 0;
        boolean isDigit = "0123456789".indexOf(vowel) >= 0;

        if (isVowel) {
            System.out.println("vowel");
        } else if (isDigit) {
            System.out.println("digit");
        } else {
            System.out.println("other");
        }
    }
}
