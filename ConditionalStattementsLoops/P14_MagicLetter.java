import java.util.Scanner;

public class P14_MagicLetter {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        char first = reader.nextLine().charAt(0);
        char second = reader.nextLine().charAt(0);
        char notPrinted = reader.nextLine().charAt(0);

        for (char i = first; i <= second; i++) {
            for (char j = first; j <= second; j++) {
                for (char k = first; k <= second; k++) {
                    if (!(i == notPrinted || j == notPrinted || k == notPrinted)) {
                        System.out.print("" + i + j + k + " ");
                    }
                }
            }
        }
    }
}
