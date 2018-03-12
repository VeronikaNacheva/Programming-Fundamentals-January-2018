import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class P05_ArrayManipulator {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String[] numbersArr = reader.readLine().split("\\s+");

        List<Integer> numsList = new ArrayList<>();
        for (String n : numbersArr) {
            numsList.add(Integer.parseInt(n));
        }

        String command = "";
        String[] sequence;

        while (!"print".equals(command)) {
            sequence = reader.readLine().split("\\s+");
            command = sequence[0];
            int element = 0;
            int position = 0;
            int index = 0;
            int sumElements = 0;
            if ("add".equals(command)) {
                index = Integer.parseInt(sequence[1]);
                element = Integer.parseInt(sequence[2]);
                numsList.add(index, element);
            } else if ("addMany".equals(command)) {
                for (int i = sequence.length - 1; i >= 2; i--) {
                    index = Integer.parseInt(sequence[1]);
                    element = Integer.parseInt(sequence[i]);
                    numsList.add(index, element);
                }
            } else if ("contains".equals(command)) {
                element = Integer.parseInt(sequence[1]);
                boolean contains = false;
                for (int i = 0; i < numsList.size(); i++) {
                    if (numsList.get(i) == element) {
                        System.out.println(i);
                        contains = true;
                        break;
                    }
                }
                if (!contains) {
                    System.out.println(-1);
                }
            } else if ("remove".equals(command)) {
                index = Integer.parseInt(sequence[1]);
                numsList.remove(index);
            } else if ("shift".equals(command)) {
                position = Integer.parseInt(sequence[1]);
                for (int i = 0; i < position % numbersArr.length; i++) {
                    int temp = numsList.get(0);

                    for (int j = 0; j < numsList.size() - 1; j++) {
                        numsList.set(j, numsList.get(j + 1));
                    }
                    numsList.set(numsList.size() - 1, temp);
                }
            } else if ("sumPairs".equals(command)) {
                for (int i = 0; i < numsList.size() - 1; i++) {
                    int firstElement = numsList.get(i);
                    int secondElement = numsList.get(i + 1);
                    sumElements = firstElement + secondElement;
                    numsList.set(i, sumElements);
                    numsList.remove(i + 1);
                }
            }
        }
        System.out.println(numsList);
    }
}
