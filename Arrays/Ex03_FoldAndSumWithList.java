import java.util.*;
import java.util.stream.Collectors;

public class Ex03_FoldAndSumWithList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] ints = Arrays.stream(sc.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();

        List<Integer> input = Arrays.stream(ints).boxed().collect(Collectors.toList());
        int k = input.size() / 4;
        List<Integer> firstList = new ArrayList<Integer>();
        List<Integer> secondList = new ArrayList<Integer>();
        List<String> list = new ArrayList<>();

        firstList.addAll(input.subList(0, k));
        Collections.reverse(firstList);
        Collections.reverse(input);
        firstList.addAll(input.subList(0, k));
        secondList.addAll(input.stream().skip(k).collect(Collectors.toList()));
        Collections.reverse(secondList);
        secondList.subList(0, k).clear();


        for (int i = 0; i < input.size() / 2; i++) {
            list.add((String.valueOf(firstList.get(i) + secondList.get(i))));
        }

        System.out.println(String.join(" ", list));
    }
}
