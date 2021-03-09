package hu.meiit.haladojava.logic;

public enum Operation {
    ADDITION('+'), SUBTRACTION('-'), MULTIPLICATION('*'), DIVISION('/');

    private char operator;

    private Operation(char operator) {
        this.operator = operator;
    }

    public char getOperator() {
        return operator;
    }
}
