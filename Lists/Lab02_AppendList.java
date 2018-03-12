import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Lab02_AppendList {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String[] input = reader.readLine().split("\\|");

        ArrayList<String> reversedList = new ArrayList<>();

        for (int i = input.length - 1; i >= 0; i--) {
            String[] numbersSplit = input[i].split("\\s+");
            for (String item : numbersSplit) {
                if (!" ".equals(item) && !"".equals(item)) {
                    reversedList.add(item);
                }
            }
        }
        System.out.println(String.join(" ", reversedList));
    }
}