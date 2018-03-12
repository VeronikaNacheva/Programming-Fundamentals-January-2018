import java.util.Scanner;

public class Lab08_GreaterOfTwoValues {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String type = scanner.nextLine();

        if ("int".equals(type)) {
            int firstNum = Integer.parseInt(scanner.nextLine());
            int secondNum = Integer.parseInt(scanner.nextLine());
            System.out.println(getMax(firstNum, secondNum));
        } else if ("char".equals(type)) {
            char firstChar = scanner.nextLine().charAt(0);
            char secondChar = scanner.nextLine().charAt(0);
            System.out.println(getMax(firstChar, secondChar));
        } else {
            String firstText = scanner.nextLine();
            String secondText = scanner.nextLine();
            System.out.println(getMax(firstText, secondText));
        }
    }

    public static int getMax(int firstNum, int secondNum) {
        if (firstNum > secondNum) {
            return firstNum;
        } else {
            return secondNum;
        }
    }

    public static char getMax(char firstChar, char secondChar) {
        if (firstChar > secondChar) {
            return firstChar;
        } else {
            return secondChar;
        }
    }

    public static String getMax(String firstText, String secondText) {
        if (firstText.compareTo(secondText) >= 0) {
            return firstText;
        } else {
            return secondText;
        }
    }
}
