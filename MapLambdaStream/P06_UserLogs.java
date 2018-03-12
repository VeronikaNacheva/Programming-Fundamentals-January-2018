import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class P06_UserLogs {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        List<String> list = new ArrayList<>();
        TreeMap<String, LinkedHashMap<String, Integer>> hashMap = new TreeMap<>();

        String line = "";
        while (!"end".equals(line = reader.readLine())) {
            String[] inputSequence = line.split("[= ]");
            String name = inputSequence[inputSequence.length - 1];
            String ip = inputSequence[1];

            if (!hashMap.containsKey(name)) {
                hashMap.put(name, new LinkedHashMap<>());
            }

            if (hashMap.get(name).containsKey(ip)) {
                hashMap.get(name).put(ip, hashMap.get(name).get(ip) + 1);
            } else {
                hashMap.get(name).put(ip, 1);
            }
        }

        for (Map.Entry<String, LinkedHashMap<String, Integer>> userAndIps : hashMap.entrySet()) {
            LinkedHashMap<String, Integer> ipsAndCount = userAndIps.getValue();

            List<String> ips = new ArrayList<>();
            for (Map.Entry<String, Integer> ipAndCount : ipsAndCount.entrySet()) {
                String currentIp = ipAndCount.getKey() + " => " + ipAndCount.getValue();
                ips.add(currentIp);
            }
            System.out.printf("%s:%n", userAndIps.getKey());
            System.out.printf("%s.%n", String.join(", ", ips));
        }
    }
}
