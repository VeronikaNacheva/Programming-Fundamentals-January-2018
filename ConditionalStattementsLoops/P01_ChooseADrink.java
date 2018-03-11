import java.util.Scanner;

public class P01_ChooseADrink {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String profession = scanner.nextLine();

        if ("Athlete".equals(profession)) {
            System.out.println("Water");
        } else if ("Businessman".equals(profession) || "Businesswoman".equals(profession)) {
            System.out.println("Coffee");
        } else if ("SoftUni Student".equals(profession)) {
            System.out.println("Beer");
        } else {
            System.out.println("Tea");
        }
    }
}
