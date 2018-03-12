import java.util.Scanner;

public class Ex05_CompareCharArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String first = scanner.nextLine();
        String second = scanner.nextLine();

        char[] firstArray = first.replaceAll(" ", "").toCharArray();
        char[] secondArray = second.replaceAll(" ", "").toCharArray();


        int min = Math.min(firstArray.length, secondArray.length);
        for (int i = 0; i < min; i++) {
            if (firstArray[i] < secondArray[i] && i < min - 1) {
                for (char aFirstArray : firstArray) {
                    System.out.print(String.valueOf(aFirstArray));
                }
                System.out.println();
                for (char aSecondArray : secondArray) {
                    System.out.print(String.valueOf(aSecondArray));
                }
                System.out.println();
                break;
            } else if (firstArray[i] > secondArray[i] && i < min - 1) {
                for (char aSecondArray : secondArray) {
                    System.out.print(String.valueOf(aSecondArray));
                }
                System.out.println();
                for (char aFirstArray : firstArray) {
                    System.out.print(String.valueOf(aFirstArray));
                }
                break;
            } else {
                if (i == min - 1 && firstArray.length == min) {
                    for (char aFirstArray : firstArray) {
                        System.out.print(String.valueOf(aFirstArray));
                    }
                    System.out.println();
                    for (char aSecondArray : secondArray) {
                        System.out.print(String.valueOf(aSecondArray));
                    }
                    System.out.println();
                } else if (i == min - 1 && secondArray.length == min) {
                    for (char aSecondArray : secondArray) {
                        System.out.print(String.valueOf(aSecondArray));
                    }
                    System.out.println();
                    for (char aFirstArray : firstArray) {
                        System.out.print(String.valueOf(aFirstArray));
                    }
                    System.out.println();
                }
            }
        }
    }
}
