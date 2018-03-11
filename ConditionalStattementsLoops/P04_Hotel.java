import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P04_Hotel {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String month = reader.readLine();
        int countNights = Integer.parseInt(reader.readLine());

        double sumStudio = 0;
        double sumDouble = 0;
        double sumSuite = 0;
        if ("May".equals(month) || "October".equals(month)) {

            sumStudio = countNights * 50.0;
            sumDouble = countNights * 65.0;
            sumSuite = countNights * 75.0;

            if ("October".equals(month) && countNights > 7) {
                sumStudio = (countNights - 1) * 50.0;
            }

            if (countNights > 7) {
                sumStudio = sumStudio - (sumStudio * 0.05);
            }


        } else if ("June".equals(month) || "September".equals(month)) {
            sumStudio = countNights * 60.0;
            sumDouble = countNights * 72.0;
            sumSuite = countNights * 82.0;

            if ("September".equals(month) && countNights > 7) {
                sumStudio = (countNights - 1) * 60.0;
            }

            if (countNights > 14) {
                sumDouble = sumDouble - (sumDouble * 0.10);
            }
        } else if ("July".equals(month) || "August".equals(month) || "December".equals(month)) {
            sumStudio = countNights * 68.0;
            sumDouble = countNights * 77.0;
            sumSuite = countNights * 89.0;

            if (countNights > 14) {
                sumSuite = sumSuite - (sumSuite * 0.15);
            }
        }

        System.out.printf("Studio: %.2f lv.%n", sumStudio);
        System.out.printf("Double: %.2f lv.%n", sumDouble);
        System.out.printf("Suite: %.2f lv.", sumSuite);
    }
}
