import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Lab01_CenturiesToMinutes {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int centuries = Integer.parseInt(reader.readLine());

        int years = centuries * 100;
        int days = (int) (years * 365.2422);
        long hours = days * 24;
        long minutes = hours * 60;

        System.out.printf("%d centuries = %d years = %d days = %d hours = %d minutes",
                centuries, years, days, hours, minutes);

    }
}
