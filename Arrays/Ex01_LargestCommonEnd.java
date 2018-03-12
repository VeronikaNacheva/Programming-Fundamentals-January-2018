import java.util.Scanner;

public class Ex01_LargestCommonEnd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] firstInput = scanner.nextLine().split(" ");
        String[] secondInput = scanner.nextLine().split(" ");

        int length = Math.min(firstInput.length, secondInput.length);

        int leftCount = 0;
        int rightCount = 0;
        for (int i = 0; i < length; i++) {
            if (firstInput[i].equals(secondInput[i])) {
                leftCount++;
            }
            if (firstInput[firstInput.length - i - 1].equals(secondInput[secondInput.length - i - 1])) {
                rightCount++;
            }
        }
        System.out.println(Math.max(leftCount, rightCount));

    }
}
