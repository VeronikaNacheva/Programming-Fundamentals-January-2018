import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;

public class P02_PhonebookUpgrade {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        LinkedHashMap<String, String> phonebookMap = new LinkedHashMap<>();

        String command = "";
        while (!"END".equals(command = reader.readLine())) {
            String[] input = command.split("\\s+");

            if ("A".equals(input[0])) {
                phonebookMap.put(input[1], input[2]);
            } else if ("S".equals(input[0])){
                if (phonebookMap.containsKey(input[1])) {
                    System.out.printf("%s -> %s%n", input[1], phonebookMap.get(input[1]));
                } else {
                    System.out.printf("Contact %s does not exist.%n", input[1]);
                }
            } else if ("ListAll".equals(input[0])) {
                phonebookMap.entrySet()
                        .stream()
                        .sorted((e1, e2) -> e1.getKey().compareTo(e2.getKey()))
                        .forEach(c -> System.out.printf("%s -> %s%n", c.getKey(), c.getValue()));
            }
        }
    }
}
