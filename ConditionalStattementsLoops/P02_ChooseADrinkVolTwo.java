import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P02_ChooseADrinkVolTwo {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String profession = reader.readLine();
        int quantity = Integer.parseInt(reader.readLine());

        if ("Athlete".equals(profession)) {
            System.out.printf("The %s has to pay %.2f.", profession, quantity * 0.70);
        } else if ("Businessman".equals(profession) || "Businesswoman".equals(profession)) {
            System.out.printf("The %s has to pay %.2f.", profession, quantity * 1.00);
        } else if ("SoftUni Student".equals(profession)) {
            System.out.printf("The %s has to pay %.2f.", profession, quantity * 1.70);
        } else {
            System.out.printf("The %s has to pay %.2f.", profession, quantity * 1.20);
        }
    }
}
