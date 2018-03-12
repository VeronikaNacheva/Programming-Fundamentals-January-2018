import java.util.*;

public class Lab01_RemoveNegativesAndReverse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(" ");

        List<Integer> nums = new ArrayList<>();
        List<Integer> positiveNums = new ArrayList<>();

        for (String a : input) {
            nums.add(Integer.valueOf(a));
        }

        for (int n : nums) {
            if (n >= 0) {
                positiveNums.add(n);

            }
        }

        List<String> stringList = new ArrayList<>();
        if (positiveNums.size() > 0) {
            Collections.reverse(positiveNums);
            for (Integer positiveNum : positiveNums) {
                stringList.add(String.valueOf(positiveNum));
            }
            System.out.println(String.join(" ", stringList));
        } else {
            System.out.println("empty");
        }
    }
}
