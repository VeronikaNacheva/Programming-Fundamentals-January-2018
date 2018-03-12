import java.util.Scanner;

public class P02_MaxMethods {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstNum = Integer.parseInt(scanner.nextLine());
        int secondNum = Integer.parseInt(scanner.nextLine());
        int thirdNum = Integer.parseInt(scanner.nextLine());

        int maxOfTwo = getMax(firstNum, secondNum);
        int max = 0;
        if (maxOfTwo > thirdNum) {
            max = maxOfTwo;
        } else {
            max = thirdNum;
        }
        System.out.println(max);
    }

    public static int getMax(int first, int second) {
        if (first > second) {
            return first;
        } else {
            return second;
        }
    }
}
