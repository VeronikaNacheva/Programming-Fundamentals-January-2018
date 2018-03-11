import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P11_FiveDifferentNumber {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int firstNum = Integer.parseInt(reader.readLine());
        int secondNum = Integer.parseInt(reader.readLine());

        int diff = Math.abs(firstNum - secondNum);

        if (diff < 5) {
            System.out.println("No");
        }

        for (int i = firstNum; i < secondNum; i++) {
            for (int j = firstNum; j < secondNum; j++) {
                for (int k = firstNum; k < secondNum; k++) {
                    for (int l = firstNum; l < secondNum; l++) {
                        for (int m = firstNum; m <= secondNum; m++) {
                            if (firstNum <= i && i < j && j < k && k < l && l < m && m <= secondNum) {
                                System.out.printf("%d %d %d %d %d%n", i, j, k, l, m);
                            }
                        }
                    }
                }
            }
        }
    }
}
