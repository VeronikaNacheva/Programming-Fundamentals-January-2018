import java.util.Arrays;
import java.util.Scanner;

public class Lab09_ExtractMiddle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] arr = scanner.nextLine().split("\\s+");

        int[] input = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            input[i] = Integer.parseInt(arr[i]);
        }

        if (input.length == 1){
            System.out.println(input[0]);
        }else if (input.length % 2 != 0){
            System.out.printf("{ %d, %d, %d }", input[input.length / 2 - 1],
                                                input[input.length / 2],
                                                input[input.length / 2 + 1]);
        } else if (input.length % 2 == 0) {
            System.out.printf("{ %d, %d }", input[input.length / 2 - 1],
                                            input[input.length / 2]);
        }
    }
}
