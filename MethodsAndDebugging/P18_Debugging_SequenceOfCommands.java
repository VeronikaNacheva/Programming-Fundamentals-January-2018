import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class P18_Debugging_SequenceOfCommands {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int countSequence = Integer.parseInt(reader.readLine());

        ArrayList<Integer> sequenceNumbers = new ArrayList<>();

        String[] sequenceNums = reader.readLine().split("\\s+");

        for (int j = 0; j < sequenceNums.length; j++) {
            int nums = Integer.parseInt(sequenceNums[j]);
            sequenceNumbers.add(nums);
        }

        ArrayList<String> resultList = new ArrayList<>();
        String command = "";

        for (int i = 0; i < countSequence - 1; i++) {
            String[] sequence;

            while (!("stop".equals(command))) {
                sequence = reader.readLine().split("\\s+");
                command = sequence[0];
                if (sequence.length > 1) {
                    int sum = 0;
                    int index = Integer.parseInt(sequence[1]);
                    int value = Integer.parseInt(sequence[2]);
                    if ("add".equals(sequence[0])) {
                        sum = sequenceNumbers.get(index - 1) + value;
                        sequenceNumbers.remove(index - 1);
                        sequenceNumbers.add(index - 1, sum);

                        printList(sequenceNumbers, resultList);
                    }
                    if ("subtract".equals(sequence[0])) {
                        sum = sequenceNumbers.get(index - 1) - value;
                        sequenceNumbers.remove(index - 1);
                        sequenceNumbers.add(index - 1, sum);

                        printList(sequenceNumbers, resultList);
                    }
                    if ("multiply".equals(sequence[0])) {
                        sum = sequenceNumbers.get(index - 1) * value;
                        sequenceNumbers.remove(index - 1);
                        sequenceNumbers.add(index - 1, sum);

                        printList(sequenceNumbers, resultList);
                    }
                } else {
                    if ("rshift".equals(sequence[0])) {
                        int temp = sequenceNumbers.get(sequenceNumbers.size() - 1);

                        for (int j = sequenceNumbers.size() - 1; j > 0; j--) {
                            sequenceNumbers.set(j, sequenceNumbers.get(j - 1));
                        }
                        sequenceNumbers.set(0, temp);

                        printList(sequenceNumbers, resultList);
                    }
                    if ("lshift".equals(sequence[0])) {
                        int temp = sequenceNumbers.get(0);

                        for (int j = 0; j < sequenceNumbers.size() - 1; j++) {
                            sequenceNumbers.set(j, sequenceNumbers.get(j + 1));
                        }
                        sequenceNumbers.set(sequenceNumbers.size() - 1, temp);

                        printList(sequenceNumbers, resultList);
                    }
                }
            }
        }
    }

    public static void printList(ArrayList<Integer> sequenceNumbers, ArrayList<String> resultList) {
        resultList = new ArrayList<>();
        for (int nums : sequenceNumbers) {
            resultList.add(String.valueOf(nums));
        }
        System.out.println(String.join(" ", resultList));
    }
}