import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Map;
import java.util.TreeMap;

public class P09_LegendaryFarming {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        Map<String, Integer> keyMaterials = new TreeMap<>();
        keyMaterials.put("shards", 0);
        keyMaterials.put("fragments", 0);
        keyMaterials.put("motes", 0);

        Map<String, Integer> junkMaterals = new TreeMap<>();

        boolean getMoreMaterials = true;
        String obtained = "";

        while (getMoreMaterials) {
            String[] line = reader.readLine().split(" ");

            for (int i = 0; i < line.length; i+=2) {
                int quantity = Integer.parseInt(line[i]);
                String material = line[i + 1].toLowerCase();

                if (!keyMaterials.containsKey(material)) {
                    if (!junkMaterals.containsKey(material)) {
                        junkMaterals.put(material, 0);
                    }
                    junkMaterals.put(material, junkMaterals.get(material) + quantity);
                } else {
                    keyMaterials.put(material, keyMaterials.get(material) + quantity);
                    if (keyMaterials.get(material) >= 250) {
                        obtained = material;
                        keyMaterials.put(material, keyMaterials.get(material) - 250);
                        getMoreMaterials = false;
                        break;
                    }
                }
            }
        }
        System.out.printf("%s obtained!%n", getObtained(obtained));

        keyMaterials.entrySet()
                .stream()
                .sorted((e1,e2) -> e2.getValue().compareTo(e1.getValue()))
                .forEach(q -> {
                    System.out.printf("%s: %d%n", q.getKey(), q.getValue());
                });
        junkMaterals.forEach((key, value) -> System.out.printf("%s: %d%n", key, value));
    }

    public static String getObtained (String material) {
        String obtained = "";
        switch (material) {
            case "shards":
                obtained = "Shadowmourne";
                break;
            case "fragments":
                obtained = "Valanyr";
                break;
            default:
                obtained = "Dragonwrath";
                break;
        }
        return obtained;
    }
}
