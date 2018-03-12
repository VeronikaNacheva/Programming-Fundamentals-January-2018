import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedHashMap;

public class P01_Phonebook {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        LinkedHashMap<String, String> phonebookMap = new LinkedHashMap<>();

        String command = "";
        while (!"END".equals(command = reader.readLine())) {
            String[] input = command.split("\\s+");

            if ("A".equals(input[0])) {
                phonebookMap.put(input[1], input[2]);
            } else {
                if (phonebookMap.containsKey(input[1])) {
                    System.out.printf("%s -> %s%n", input[1], phonebookMap.get(input[1]));
                } else {
                    System.out.printf("Contact %s does not exist.%n", input[1]);
                }
            }
        }
    }
}
