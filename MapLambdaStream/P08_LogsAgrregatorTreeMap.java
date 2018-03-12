import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Map;
import java.util.TreeMap;

public class P08_LogsAgrregatorTreeMap {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(reader.readLine());
        String line = "";

        Map<String, TreeMap<String, Long>> map = new TreeMap<>();
        Map<String, Long> durations = new TreeMap<>();

        for (int i = 0; i < n; i++) {
            line = reader.readLine();
            String[] tokens = line.split(" ");

            String ip = tokens[0];
            String user = tokens[1];
            long duration = Integer.parseInt(tokens[2]);

            if (!map.containsKey(user)) {
                map.put(user, new TreeMap<>());
                durations.put(user, 0L);
            }
            map.get(user).put(ip, duration);
            long totalDuration = durations.get(user);
            durations.put(user, totalDuration + duration);
        }

        for (Map.Entry<String, Long> pair : durations.entrySet()) {
            System.out.printf("%s: %d ", pair.getKey(), pair.getValue());
            System.out.printf("[%s]%n", String.join(", ", map.get(pair.getKey()).keySet()));
        }
    }
}
