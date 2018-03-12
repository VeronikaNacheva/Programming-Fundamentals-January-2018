import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class P18_DifferentIntegers {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String input = reader.readLine();

        try {
            long num = Long.parseLong(input);

            boolean isSByte = num >= -128 && num <= 127;
            boolean isByte = num >= 0 && num <= 255;
            boolean isShort = (num >= Short.MIN_VALUE) && (num <= Short.MAX_VALUE);
            boolean isUShort = (num >= 0) && (num <= 65535);
            boolean isInt = (num >= Integer.MIN_VALUE) && (num <= Integer.MAX_VALUE);
            boolean isUInt = (num >= 0) && (num <= 4294967295L);
            boolean isLong = (num >= Long.MIN_VALUE) && (num <= Long.MAX_VALUE);

            System.out.printf("%d can fit in:%n", num);

            if (isSByte) {
                System.out.println("* sbyte");
            }
            if (isByte) {
                System.out.println("* byte");
            }
            if (isShort) {
                System.out.println("* short");
            }
            if (isUShort) {
                System.out.println("* ushort");
            }
            if (isInt) {
                System.out.println("* int");
            }
            if (isUInt) {
                System.out.println("* uint");
            }
            if (isLong) {
                System.out.println("* long");
            }
        } catch (Exception exception) {
            System.out.printf("%s can't fit in any type", input);
        }

    }
}