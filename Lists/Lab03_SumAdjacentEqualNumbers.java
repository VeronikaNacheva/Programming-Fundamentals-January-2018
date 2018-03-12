import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

public class Lab03_SumAdjacentEqualNumbers {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        DecimalFormat df = new DecimalFormat("#.###");

        String[] input = reader.readLine().split("\\s+");

        ArrayList<Double> myList = new ArrayList<>();
        ArrayList<String> resultList = new ArrayList<>();

        for (String items : input) {
            myList.add(Double.valueOf(items));
        }

        boolean result = false;
        while (!result) {
            double sum = 0;
            if (myList.size() < 2) {
                result = true;
                break;
            }
            for (int i = 0; i < myList.size() - 1; ) {
                if (i < 0) i = 0;
                if (myList.size() < 2) break;
                double firstNum = myList.get(i);
                double secondNum = myList.get(i + 1);
                if (firstNum == secondNum) {
                    sum = firstNum + secondNum;
                    myList.remove(i + 1);
                    myList.set(i, sum);

                    i--;
                    result = true;
                } else i++;
            }
            if (!result) result = true;
        }

        for (double i : myList) {
            resultList.add(String.valueOf(df.format(i)));
        }

        System.out.print(String.join(" ", resultList));

    }
}