package com.neoflex.calculator.models;

public enum Operator {
    ADD("add"),
    SUBTRACT("subtract"),
    MULTIPLY("multiply"),
    DIVIDE("divide");

    private final String code;

    Operator(String code) {
        this.code = code;
    }

    public static Operator fromString(String code) {
        if (code != null) {
            for (Operator op : Operator.values()) {
                if (code.equalsIgnoreCase(op.code)) {
                    return op;
                }
            }
        }
        throw new IllegalArgumentException("No such value");
    }
}
