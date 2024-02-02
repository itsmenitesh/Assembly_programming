import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class Main {
    private static Map<String, Integer> registers = new HashMap<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Enter the operation (MV, ADD, SHOW, EXIT):");
            String input = scanner.nextLine();
            String[] tokens = input.split("\\s+");

            if ("EXIT".equalsIgnoreCase(tokens[0])) {
                System.out.println("Program terminated.");
                break;
            }

            executeInstruction(tokens);
        }
    }

    public static void executeInstruction(String[] tokens) {
        if (tokens.length < 2) {
            System.out.println("Invalid input. Please provide an operation and a register.");
            return;
        }

        Operation operation = null;
        String register = tokens[1];

        if (tokens.length > 2) {
            try {
                int value = Integer.parseInt(tokens[2]);
                operation = Operation.valueOf(tokens[0].toUpperCase());

                switch (operation) {
                    case MV:
                        moveValue(register, value);
                        break;
                    case ADD:
                        addValue(register, value);
                        break;
                    case SHOW:
                        showValue(register);
                        break;
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please provide a valid numeric value for the operation.");
            } catch (IllegalArgumentException e) {
                System.out.println("Invalid operation. Please use MV, ADD, SHOW, or EXIT.");
            }
        } else {
            if ("SHOW".equalsIgnoreCase(tokens[0])) {
                showValue(register);
            } else {
                System.out.println("Invalid input. Please provide all required parameters.");
            }
        }
    }




    public static void moveValue(String register, int value) {
        registers.put(register, value);
        System.out.println("Moved value " + value + " to register " + register);
    }


    public static void addValue(String register, int value) {
        int currentValue = registers.getOrDefault(register, 0);
        int newValue = currentValue + value;
        registers.put(register, newValue);
        System.out.println("Added value " + value + " to register " + register);
    }

    public static void showValue(String register) {
        int value = registers.getOrDefault(register, 0);
        System.out.println("Value in register " + register + ": " + value);
    }
}
