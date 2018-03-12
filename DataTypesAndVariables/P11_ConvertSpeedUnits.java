import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;

public class P11_ConvertSpeedUnits {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        DecimalFormat first = new DecimalFormat("#.#######");

        int distanceMeter = Integer.parseInt(reader.readLine());
        int hours = Integer.parseInt(reader.readLine());
        int minutes = Integer.parseInt(reader.readLine());
        int seconds = Integer.parseInt(reader.readLine());

        int allMinutes = (hours * 60) + minutes;
        int allSeconds = (allMinutes * 60) + seconds;
        int allTime = hours * 3600 + minutes * 60 + seconds;

        float allHours = allSeconds * 0.000277777778f;

        float allKm = distanceMeter * 0.001f;

        float meterPerSeconds = (float) distanceMeter / allSeconds;
        float kmPerHour = allKm / allHours;
        float milePerHour = (distanceMeter / (float) 1609) / (allTime / (float) 3600);

        System.out.println(first.format(meterPerSeconds));
        System.out.println(first.format(kmPerHour));
        System.out.println(first.format(milePerHour));

    }
}
