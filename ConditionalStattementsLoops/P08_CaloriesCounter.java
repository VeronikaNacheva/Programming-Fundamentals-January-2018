import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class P08_CaloriesCounter {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(reader.readLine());

        int sum = 0;
        int kCall = 0;
        String ingredient = "";
        for (int i = 0; i < n; i++) {
            ingredient = reader.readLine().toLowerCase();

            if ("cheese".equals(ingredient)) {
                kCall = 500;
            } else if ("tomato sauce".equals(ingredient)) {
                kCall = 150;
            } else if ("salami".equals(ingredient)) {
                kCall = 600;
            } else if ("pepper".equals(ingredient)) {
                kCall = 50;
            }

            if ("cheese".equals(ingredient) || "tomato sauce".equals(ingredient) ||
                    "salami".equals(ingredient) || "pepper".equals(ingredient)) {
                sum += kCall;
            }
        }

        System.out.printf("Total calories: %d", sum);
    }
}
