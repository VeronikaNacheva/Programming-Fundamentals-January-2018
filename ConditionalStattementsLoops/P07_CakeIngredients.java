import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P07_CakeIngredients {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String ingredient = reader.readLine();

        int counter = 0;
        while (!("Bake!".equals(ingredient))) {
            System.out.printf("Adding ingredient %s.%n", ingredient);
            ingredient = reader.readLine();
            counter++;
        }
        System.out.printf("Preparing cake with %d ingredients.", counter);
    }
}
