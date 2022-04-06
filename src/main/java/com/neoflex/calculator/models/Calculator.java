package com.neoflex.calculator.models;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Calculator implements ICalculable<BigDecimal> {

    private final static int DIVISION_PRECISION = 3;

    private final BigDecimal firstNum;
    private final BigDecimal secondNum;

    public Calculator(BigDecimal firstNum, BigDecimal secondNum) {
        this.firstNum = firstNum;
        this.secondNum = secondNum;
    }

    public BigDecimal add() {
        return this.firstNum.add(this.secondNum);
    }

    public BigDecimal subtract() {
        return this.firstNum.subtract(this.secondNum);
    }

    public BigDecimal multiply() {
        return this.firstNum.multiply(this.secondNum);
    }

    public BigDecimal divide() throws ArithmeticException {
        return this.firstNum.divide(this.secondNum, DIVISION_PRECISION, RoundingMode.HALF_UP);
    }
}
