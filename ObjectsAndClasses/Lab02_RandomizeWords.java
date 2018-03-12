import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class Lab02_RandomizeWords {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String[] words = reader.readLine().split(" ");

        Random random = new Random();

        for (int pos1 = 0; pos1 < words.length; pos1++) {
            int pos2 = random.nextInt(words.length);

            String temp = words[pos1];
            words[pos1] = words[pos2];
            words[pos2] = temp;
        }

        for (String word : words) {
            System.out.println(word);
        }
    }
}
