public class Instruction {
    Operation operation;
    String register;
    int value;

    public Instruction(Operation operation, String register, int value) {
        this.operation = operation;
        this.register = register;
        this.value = value;
    }
}
