import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Lab08_RefactorVolumeOfPyramid {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Length: ");
        double length = Double.parseDouble(reader.readLine());
        System.out.print("Width: ");
        double width = Double.parseDouble(reader.readLine());
        System.out.print("Height: ");
        double height = Double.parseDouble(reader.readLine());

        double vol = (length * width * height) / 3;

        System.out.printf("Pyramid Volume: %.2f", vol);
    }
}
