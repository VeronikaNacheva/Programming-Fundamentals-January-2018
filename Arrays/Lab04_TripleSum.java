import java.util.Arrays;
import java.util.Scanner;

public class Lab04_TripleSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] inputArr = Arrays.stream(scanner.nextLine()
                .split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();

        boolean isFound = false;
        for (int i = 0; i < inputArr.length; i++) {
            for (int j = i + 1; j < inputArr.length; j++) {
                for (int k = 0; k < inputArr.length; k++) {
                    if (inputArr[i] + inputArr[j] == inputArr[k]) {
                        System.out.printf("%d + %d == %d%n", inputArr[i], inputArr[j], inputArr[k]);
                        isFound = true;
                        break;
                    }
                }
            }
        }
        if (!isFound){
            System.out.println("No");
        }
    }
}
