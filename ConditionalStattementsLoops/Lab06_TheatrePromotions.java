import java.util.Scanner;

public class Lab06_TheatrePromotions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String typeOfDay = scanner.nextLine();
        int age = Integer.parseInt(scanner.nextLine());

        if (age >= 0 && age <= 18){
            if ("Weekday".equals(typeOfDay)){
                System.out.println("12$");
            } else if ("Weekend".equals(typeOfDay)){
                System.out.println("15$");
            } else {
                System.out.println("5$");
            }
        } else if (age >= 19 && age <= 64) {
            if ("Weekday".equals(typeOfDay)){
                System.out.println("18$");
            } else if ("Weekend".equals(typeOfDay)){
                System.out.println("20$");
            } else {
                System.out.println("12$");
            }
        } else if (age >= 65 && age <= 122) {
            if ("Weekday".equals(typeOfDay)){
                System.out.println("12$");
            } else if ("Weekend".equals(typeOfDay)){
                System.out.println("15$");
            } else {
                System.out.println("10$");
            }
        } else {
            System.out.println("Error!");
        }
    }
}
