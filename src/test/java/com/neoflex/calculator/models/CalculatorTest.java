package com.neoflex.calculator.models;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName(value = "Model Calculator is working when")
class CalculatorTest {

    private ICalculable<BigDecimal> calculator;
    private ICalculable<BigDecimal> calculatorZero;

    @BeforeEach
    void setUp() {
        calculator = new Calculator(BigDecimal.valueOf(10), BigDecimal.valueOf(2.5));
        calculatorZero = new Calculator(BigDecimal.valueOf(7), BigDecimal.valueOf(0));
    }

    @Test
    @DisplayName("add() is working")
    void add() {
        assertEquals(calculator.add(), BigDecimal.valueOf(12.5));
        assertEquals(calculatorZero.add(), BigDecimal.valueOf(7));
    }

    @Test
    @DisplayName("subtract() is working")
    void subtract() {
        assertEquals(calculator.subtract(), BigDecimal.valueOf(7.5));
        assertEquals(calculatorZero.subtract(), BigDecimal.valueOf(7));
    }

    @Test
    @DisplayName("multiply() is working")
    void multiply() {
        assertEquals(calculator.multiply(), BigDecimal.valueOf(25.0));
        assertEquals(calculatorZero.multiply(), BigDecimal.valueOf(0));
    }

    @Test
    @DisplayName("divide() is working")
    void divide() {
        assertEquals(calculator.divide(), new BigDecimal(4.0).setScale(3));
    }

    @Test
    @DisplayName("errorDivide() is working")
    void errorDivide() throws ArithmeticException {
        Throwable thrown = assertThrows(ArithmeticException.class, () -> {
            calculatorZero.divide();
        });
        assertNotNull(thrown.getMessage());
    }

}