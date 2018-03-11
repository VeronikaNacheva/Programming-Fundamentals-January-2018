import java.text.DecimalFormat;
import java.util.Scanner;

public class P04_BeverageLabels {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.#######");

        String name = scanner.nextLine();
        int volume = Integer.parseInt(scanner.nextLine());
        int energy = Integer.parseInt(scanner.nextLine());
        int sugarContent = Integer.parseInt(scanner.nextLine());

        double allEnergy = energy / 100.0 * volume;
        double allSugar = sugarContent / 100.0 * volume;

        System.out.printf("%dml %s:%n", volume, name);
        System.out.printf("%skcal, %sg sugars", df.format(allEnergy), df.format(allSugar));
    }
}
