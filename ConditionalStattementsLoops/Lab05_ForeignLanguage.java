import java.util.Scanner;

public class Lab05_ForeignLanguage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String country = scanner.nextLine();

        if ("USA".equals(country) || "England".equals(country)) {
            System.out.println("English");
        } else if ("Spain".equals(country) || "Argentina".equals(country) || "Mexico".equals(country)){
            System.out.println("Spanish");
        }else {
            System.out.println("unknown");
        }
    }
}
