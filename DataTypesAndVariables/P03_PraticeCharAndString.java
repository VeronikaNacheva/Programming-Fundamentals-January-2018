import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P03_PraticeCharAndString {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String firstText = reader.readLine();
        char firstChar = reader.readLine().charAt(0);
        char secondChar = reader.readLine().charAt(0);
        char thirdChar = reader.readLine().charAt(0);
        String secondText = reader.readLine();

        System.out.println(firstText);
        System.out.println(firstChar);
        System.out.println(secondChar);
        System.out.println(thirdChar);
        System.out.println(secondText);
    }
}
