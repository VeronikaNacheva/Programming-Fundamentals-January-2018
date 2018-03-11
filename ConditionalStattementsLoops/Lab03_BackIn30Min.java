import java.util.Scanner;

public class Lab03_BackIn30Min {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int hours = Integer.parseInt(scanner.nextLine());
        int minutes = Integer.parseInt(scanner.nextLine());

        int allMinutes = hours * 60 + minutes + 30;
        int hourAfter = allMinutes / 60;
        int minutesAfter = allMinutes % 60;

        if (hourAfter == 24){
            hourAfter = 0;
        }

        System.out.printf("%d:%02d", hourAfter, minutesAfter);
    }
}
