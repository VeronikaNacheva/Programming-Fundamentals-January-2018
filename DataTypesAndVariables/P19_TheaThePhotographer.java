import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.concurrent.TimeUnit;

public class P19_TheaThePhotographer {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        long picturesCount = Integer.parseInt(reader.readLine());
        long filterTime = Integer.parseInt(reader.readLine());
        long filterFactor = Integer.parseInt(reader.readLine());
        long uploadTime = Integer.parseInt(reader.readLine());

        double percent = filterFactor / 100.0;
        long filteredPictures = (int) Math.ceil(picturesCount * percent);
        long filterTimeForAlPics = filterTime * picturesCount; //Or cast filterTime to long
        long uploadTimeForFilteredPics = uploadTime * filteredPictures; //Or cast uploadTime to long

        long totalTime = filterTimeForAlPics + uploadTimeForFilteredPics;

        long days = TimeUnit.SECONDS.toDays(totalTime);
        totalTime -= TimeUnit.DAYS.toSeconds(days);
        long hours = TimeUnit.SECONDS.toHours(totalTime);
        totalTime -= TimeUnit.HOURS.toSeconds(hours);
        long minutes = TimeUnit.SECONDS.toMinutes(totalTime);
        totalTime -= TimeUnit.MINUTES.toSeconds(minutes);

        System.out.printf("%d:%02d:%02d:%02d", days, hours, minutes, totalTime);
    }
}
