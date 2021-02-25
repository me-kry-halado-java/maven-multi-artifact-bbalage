package hu.meiit.haladojava.logic;

public class Expression {
    private final double operand1;
    private final double operand2;
    private final Operation operation;

    public Expression(double operand1, double operand2, Operation operation) {
        this.operand1 = operand1;
        this.operand2 = operand2;
        this.operation = operation;
    }

    public double getOperand1() {
        return operand1;
    }

    public double getOperand2() {
        return operand2;
    }

    public Operation getOperation() {
        return operation;
    }

    @Override
    public String toString() {
        return operand1 + " " + operation.getOperator() + " " + operand2;
    }
}
