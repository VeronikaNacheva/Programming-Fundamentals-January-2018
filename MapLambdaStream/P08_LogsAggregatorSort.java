import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class P08_LogsAggregatorSort {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(reader.readLine());
        String line = "";

        Map<String, LinkedHashMap<String, Long>> map = new LinkedHashMap<>();
        Map<String, Long> durations = new LinkedHashMap<>();

        for (int i = 0; i < n; i++) {
            line = reader.readLine();
            String[] tokens = line.split(" ");

            String ip = tokens[0];
            String user = tokens[1];
            long duration = Integer.parseInt(tokens[2]);

            if (!map.containsKey(user)) {
                map.put(user, new LinkedHashMap<>());
                durations.put(user, 0L);
            }
            map.get(user).put(ip, duration);
            long totalDuration = durations.get(user);
            durations.put(user, totalDuration + duration);
        }

        durations.entrySet()
                .stream()
                .sorted((e1, e2) -> e1.getKey().compareTo(e2.getKey()))
                .forEach(u -> {
                    List<String> list = new ArrayList<>();

                    map.get(u.getKey())
                            .entrySet()
                            .stream()
                            .sorted((e1, e2) -> e1.getKey().compareTo(e2.getKey()))
                            .forEach(i -> list.add(i.getKey()));

                    System.out.printf("%s: %d [%s]%n", u.getKey(), u.getValue(), String.join(", ", list));
                });
    }
}
