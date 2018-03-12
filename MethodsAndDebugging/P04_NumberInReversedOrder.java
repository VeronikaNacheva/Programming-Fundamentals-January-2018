import java.text.DecimalFormat;
import java.util.Scanner;

public class P04_NumberInReversedOrder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.######");

        double num = Double.parseDouble(scanner.nextLine());
        String number = String.valueOf(df.format(num));
        System.out.println(reversedNum(number));
    }

    public static String reversedNum(String number) {
        String result = "";
        for (int i = number.length() - 1; i >= 0; i--) {
            result = result + number.charAt(i);
        }
        return result;
    }
}
