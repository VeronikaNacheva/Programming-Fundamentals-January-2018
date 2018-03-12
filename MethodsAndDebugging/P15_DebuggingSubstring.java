import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P15_DebuggingSubstring {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String text = reader.readLine();
        int jump = Integer.parseInt(reader.readLine());

        char search = 'p';
        boolean hasMatch = false;
        String matchedString = "";


        for (int i = 0; i < text.length(); i++) {
            matchedString = "";
            if (text.charAt(i) == search) {
                hasMatch = true;

                int length = jump + 1;
                if (i + length < text.length()) {
                    matchedString = "";
                    matchedString = text.substring(i, i + length);
                } else {
                    matchedString = text.substring(i);
                }
                System.out.println(matchedString);
                i += jump;
            }
        }

        if (!hasMatch) {
            System.out.println("no");
        }
    }
}
