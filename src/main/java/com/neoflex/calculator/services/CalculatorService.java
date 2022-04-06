package com.neoflex.calculator.services;

import com.neoflex.calculator.forms.CalcForm;

public interface CalculatorService<T> {
    T calc(CalcForm calcForm) throws RuntimeException;
}
