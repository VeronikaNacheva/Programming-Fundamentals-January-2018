import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class P05_HandsOfCard {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String input = "";
        Map<String, Set<String>> playersCards = new LinkedHashMap<>();

        while (!"JOKER".equals(input = reader.readLine())) {
            String[] tokens = input.split(": ");
            String name = tokens[0];
            String[] cards = tokens[1].split(", ");

            if (!playersCards.containsKey(name)) {
                playersCards.put(name, new HashSet<>());
            }

            playersCards.get(name).addAll(Arrays.asList(cards));
        }

        for (Map.Entry<String, Set<String>> playerAndCards : playersCards.entrySet()) {

            int sum = 0;
            for (String card : playerAndCards.getValue()) {
                String p = card.substring(0, card.length() - 1);
                String t = card.substring(card.length() - 1);
                int f = getPowerCard(p);
                int s = getPowerCard(t);
                int res = f * s;
                sum = sum + res;
            }
            System.out.printf("%s: %d%n", playerAndCards.getKey(),sum);
        }
    }

    public static Integer getPowerCard(String key) {
        HashMap<String, Integer> map = new HashMap<>();
        for (int i = 2; i < 11; i++) {
            map.put(String.valueOf(i), i);
        }
        map.put("J", 11);
        map.put("Q", 12);
        map.put("K", 13);
        map.put("A", 14);
        map.put("S", 4);
        map.put("H", 3);
        map.put("D", 2);
        map.put("C", 1);

        return map.get(key);
    }
}
