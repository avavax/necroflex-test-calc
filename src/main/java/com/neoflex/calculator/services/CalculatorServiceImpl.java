package com.neoflex.calculator.services;

import com.neoflex.calculator.forms.CalcForm;
import com.neoflex.calculator.models.Calculator;
import com.neoflex.calculator.models.ICalculable;
import com.neoflex.calculator.models.Operator;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

@Component
public class CalculatorServiceImpl implements CalculatorService<BigDecimal> {

    @Override
    public BigDecimal calc(CalcForm calcForm) throws RuntimeException {
        ICalculable<BigDecimal> calculator = new Calculator(calcForm.getFirst(), calcForm.getSecond());

        switch (Operator.fromString(calcForm.getOperand())) {
            case ADD:
                return calculator.add();
            case SUBTRACT:
                return calculator.subtract();
            case MULTIPLY:
                return calculator.multiply();
            case DIVIDE:
                return calculator.divide();
            default:
                throw new RuntimeException("Unknown operation");
        }
    }
}
