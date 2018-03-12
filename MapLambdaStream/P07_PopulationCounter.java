import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedHashMap;
import java.util.Map;

public class P07_PopulationCounter {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String line = "";
        Map<String, LinkedHashMap<String, Long>> map = new LinkedHashMap<>();
        Map<String, Long> populations = new LinkedHashMap<>();

        while (!"report".equals(line = reader.readLine())) {
            String[] input = line.split("\\|");

            String city = input[0];
            String country = input[1];
            long population = Integer.parseInt(input[2]);

            if (!map.containsKey(country)) {
                map.put(country, new LinkedHashMap<>());
                populations.put(country, 0L);
            }
            map.get(country).put(city, population);
            long totalPopulation = populations.get(country);
            populations.put(country, totalPopulation + population);
        }
        populations.entrySet()
                .stream()
                .sorted((e1, e2) -> e2.getValue().compareTo(e1.getValue()))
                .forEach(entry -> {
                    System.out.printf("%s (total population: %d)%n", entry.getKey(), entry.getValue());
                    map.get(entry.getKey())
                            .entrySet()
                            .stream()
                            .sorted((p1, p2) -> p2.getValue().compareTo(p1.getValue()))
                            .forEach(pair -> {
                                System.out.printf("=>%s: %d%n", pair.getKey(), pair.getValue());
                            });
                });
    }
}
