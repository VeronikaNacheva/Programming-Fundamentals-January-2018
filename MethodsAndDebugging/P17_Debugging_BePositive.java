import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class P17_Debugging_BePositive {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int countSequences = Integer.parseInt(reader.readLine());

        for (int i = 0; i < countSequences; i++) {
            String[] input = reader.readLine().trim().split("\\s+");
            List<Integer> numbers = new ArrayList<>();
            List<Integer> data = new ArrayList<>();

            for (int j = 0; j < input.length; j++) {
                if (!input[j].equals("")) {
                    int num = Integer.parseInt(input[j]);
                    numbers.add(num);
                }
            }

            for (int j = 0; j < numbers.size(); j++) {
                int currentNum = numbers.get(j);

                if (currentNum >= 0) {
                    data.add(currentNum);
                } else {
                    if (j + 1 < numbers.size()) {
                        currentNum += numbers.get(j + 1);
                        j++;
                    }

                    if (currentNum >= 0) {
                        data.add(currentNum);
                    }
                }
            }

            if (data.size() == 0) {
                System.out.println("(empty)");
            } else {

                List<String> newList = new ArrayList<String>(data.size());

                for (Integer myInt : data) {
                    newList.add(myInt.toString());
                }
                String joined = newList.stream().collect(Collectors.joining(" "));
                System.out.println(String.join(" ", joined));
            }
        }
    }
}