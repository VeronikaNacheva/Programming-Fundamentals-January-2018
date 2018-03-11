import java.util.Scanner;

public class P05_CharacterStats {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        int currentHealth = Integer.parseInt(scanner.nextLine());
        int maxHealth = Integer.parseInt(scanner.nextLine());
        int currentEnergy = Integer.parseInt(scanner.nextLine());
        int maxEnergy = Integer.parseInt(scanner.nextLine());

        String firstLine = "|" + repeatStr("|", currentHealth)
                + repeatStr(".", maxHealth - currentHealth) + "|";
        String secondLine = "|" + repeatStr("|", currentEnergy)
                + repeatStr(".", maxEnergy - currentEnergy) + "|";

        System.out.printf("Name: %s%n", name);
        System.out.printf("Health: %s%n", firstLine);
        System.out.printf("Energy: %s", secondLine);
    }
    static String repeatStr(String str, int count) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < count; i++) {
            sb.append(str);
        }
        return sb.toString();
    }
}
