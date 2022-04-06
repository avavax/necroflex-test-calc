package com.neoflex.calculator.forms;

import lombok.Data;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;

@Data
public class CalcForm {
    @NotNull
    private BigDecimal first;
    @NotNull
    private BigDecimal second;
    @NotEmpty
    private String operand;
}
