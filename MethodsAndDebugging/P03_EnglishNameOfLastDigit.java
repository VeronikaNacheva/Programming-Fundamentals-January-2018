import java.util.Scanner;

public class P03_EnglishNameOfLastDigit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        long num = Long.parseLong(scanner.nextLine());
        long lastDigit = abs(num) % 10;

        String englishName = getName(lastDigit);
        System.out.printf("%s", englishName);
    }

    public static String getName(long lastDigit) {
        String englishName = "";
        if (lastDigit == 1) {
            englishName = "one";

        } else if (lastDigit == 2) {
            englishName = "two";

        } else if (lastDigit == 3) {
            englishName = "three";

        } else if (lastDigit == 4) {
            englishName = "four";

        } else if (lastDigit == 5) {
            englishName = "five";

        } else if (lastDigit == 6) {
            englishName = "six";

        } else if (lastDigit == 7) {
            englishName = "seven";

        } else if (lastDigit == 8) {
            englishName = "eight";

        } else if (lastDigit == 9) {
            englishName = "nine";

        } else if (lastDigit == 0) {
            englishName = "zero";
        }
        return englishName;
    }

    public static long abs(long a) {
        return (a < 0) ? -a : a;
    }
}
