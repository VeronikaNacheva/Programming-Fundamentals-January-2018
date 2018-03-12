import java.util.Arrays;
import java.util.Scanner;

public class Lab07_SumArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] firstArr = Arrays.stream(scanner.nextLine()
                .split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int[] secondArr = Arrays.stream(scanner.nextLine()
                .split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int[] maxArr = new int[Math.max(firstArr.length, secondArr.length)];

        int sum = 0;
        for (int i = 0; i < maxArr.length; i++) {
            sum = firstArr[i % firstArr.length] + secondArr[i % secondArr.length];

            if (i >= maxArr.length){
                break;
            }
            System.out.print(sum + " ");
        }
    }
}
