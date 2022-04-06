package com.neoflex.calculator.models;

public interface ICalculable<T> {
    T add();
    T subtract();
    T multiply();
    T divide() throws ArithmeticException;
}
