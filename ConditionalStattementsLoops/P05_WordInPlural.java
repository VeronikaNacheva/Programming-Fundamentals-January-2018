import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P05_WordInPlural {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String word = reader.readLine();

        StringBuilder build = new StringBuilder(word);

        if (word.endsWith("y")) {
            build = build.deleteCharAt(build.length() - 1).append("ies");
        } else if (word.endsWith("o") || word.endsWith("s") || word.endsWith("x") || word.endsWith("z")
                || word.endsWith("ch") || word.endsWith("sh")) {
            build = build.append("es");
        } else {
            build = build.append("s");
        }
        System.out.println(build);
    }
}
