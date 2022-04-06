package com.neoflex.calculator.controllers;

import com.neoflex.calculator.forms.CalcForm;
import com.neoflex.calculator.services.CalculatorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;
import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

@Controller
public class CalculatorControllers {
    private final CalculatorService<BigDecimal> calculatorService;

    @Autowired
    public CalculatorControllers(CalculatorService<BigDecimal> calculatorService) {
        this.calculatorService = calculatorService;
    }

    @GetMapping("/")
    public String index() {
        return "index";
    }

    @PostMapping("/")
    public ResponseEntity<Map<String, String>> calculate(@Valid CalcForm calcForm) {
        Map<String, String> map = new HashMap<>();

        try {
            BigDecimal result = this.calculatorService.calc(calcForm);
            map.put("result", result.toString());
        } catch (RuntimeException e) {
            map.put("result", e.getMessage());
        }

        return new ResponseEntity<>(map, new HttpHeaders(), HttpStatus.OK);
    }
}
