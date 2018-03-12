import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedHashMap;
import java.util.Map;

public class P03_MinerTask {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String resource = "";
        int quantity = 0;

        LinkedHashMap<String, Integer> myMap = new LinkedHashMap<>();

        while (!"stop".equals(resource = reader.readLine())) {
            quantity = Integer.parseInt(reader.readLine());

            if (myMap.containsKey(resource)) {
                myMap.put(resource, myMap.get(resource) + quantity);
            } else {
                myMap.put(resource, quantity);
            }
        }

        myMap.forEach((key, value) -> System.out.printf("%s -> %s%n", key, value));
    }
}
