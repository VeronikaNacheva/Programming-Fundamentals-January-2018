import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Lab04_Elevator {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int person = Integer.parseInt(reader.readLine());
        int capacity = Integer.parseInt(reader.readLine());

        int courses = (int) Math.ceil((double) person / capacity);

        System.out.println(courses);
    }
}
