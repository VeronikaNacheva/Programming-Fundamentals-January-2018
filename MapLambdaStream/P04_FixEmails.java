import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedHashMap;
import java.util.Map;

public class P04_FixEmails {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String name = "";
        String emails = "";

        LinkedHashMap<String, String> myMap = new LinkedHashMap<>();
        while (!"stop".equals(name = reader.readLine())) {
            emails = reader.readLine();
            if (!emails.endsWith("us") && !emails.endsWith("uk")){
                myMap.put(name, emails);
            }
        }
        myMap.forEach((key, value) -> System.out.printf("%s -> %s%n", key, value));
    }
}
