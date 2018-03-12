import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Lab07_Greeting {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String firstName = reader.readLine();
        String secondName = reader.readLine();
        int age = Integer.parseInt(reader.readLine());

        System.out.printf("Hello, %s %s. You are %d years old.", firstName, secondName, age);
    }
}
