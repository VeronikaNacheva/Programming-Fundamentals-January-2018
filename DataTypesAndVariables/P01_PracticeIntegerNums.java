import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P01_PracticeIntegerNums {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int first = Integer.parseInt(reader.readLine());
        int second = Integer.parseInt(reader.readLine());
        int third = Integer.parseInt(reader.readLine());
        int fourth = Integer.parseInt(reader.readLine());
        long fifth = Long.parseLong(reader.readLine());
        int sixth = Integer.parseInt(reader.readLine());
        long seventh = Long.parseLong(reader.readLine());

        System.out.println(first);
        System.out.println(second);
        System.out.println(third);
        System.out.println(fourth);
        System.out.println(fifth);
        System.out.println(sixth);
        System.out.println(seventh);

    }
}
