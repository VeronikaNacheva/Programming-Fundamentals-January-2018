import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P08_EmployeeData {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String firstName = reader.readLine();
        String lastName = reader.readLine();
        int age = Integer.parseInt(reader.readLine());
        char gender = reader.readLine().charAt(0);
        long personalID = Long.parseLong(reader.readLine());
        long employeeNumber = Long.parseLong(reader.readLine());

        System.out.printf("First name: %s%n", firstName);
        System.out.printf("Last name: %s%n", lastName);
        System.out.printf("Age: %d%n", age);
        System.out.printf("Gender: %c%n", gender);
        System.out.printf("Personal ID: %d%n", personalID);
        System.out.printf("Unique Employee number: %d", employeeNumber);
    }
}
