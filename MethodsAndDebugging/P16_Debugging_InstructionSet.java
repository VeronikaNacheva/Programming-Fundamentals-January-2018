import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P16_Debugging_InstructionSet {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String opCode = reader.readLine();

        long result = 0;
        while (!("END".equals(opCode))) {
            String[] codeArgs = opCode.split(" ");

            switch (codeArgs[0]) {
                case "INC": {
                    long operandOne = Long.parseLong(codeArgs[1]);
                    result = ++operandOne;
                    break;
                }
                case "DEC": {
                    long operandOne = Long.parseLong(codeArgs[1]);
                    result = --operandOne;
                    break;
                }
                case "ADD": {
                    long operandOne = Long.parseLong(codeArgs[1]);
                    long operandTwo = Long.parseLong(codeArgs[2]);
                    result = operandOne + operandTwo;
                    break;
                }
                case "MLA": {
                    long operandOne = Long.parseLong(codeArgs[1]);
                    long operandTwo = Long.parseLong(codeArgs[2]);
                    result = operandOne * operandTwo;
                    break;
                }
            }
            if ("END".equals(codeArgs[0])) {
                break;
            }
            System.out.println(result);
            opCode = reader.readLine();
        }
    }
}