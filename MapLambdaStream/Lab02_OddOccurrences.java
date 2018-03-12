import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;

public class Lab02_OddOccurrences {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String[] words = Arrays.stream(reader.readLine().split(" "))
                .map(String::toLowerCase)
                .toArray(String[]::new);

        //We use LinkedHashMap because we need to print the words in the input order
        LinkedHashMap<String, Integer> map = new LinkedHashMap<>();

        for (String word : words) {
            if (map.containsKey(word)) {
                map.put(word, map.get(word) + 1);
            } else {
                map.put(word, 1);
            }
        }

        //List to keep our odd occurrences
        ArrayList<String> resultWords = new ArrayList<>();

        for (String word : map.keySet()) {
            int counter = map.get(word);
            if (counter % 2 != 0) {
                //Add only odd occurrences
                resultWords.add(word);
            }
        }

        //Print the results
        System.out.println(String.join(", ", resultWords));
    }
}
