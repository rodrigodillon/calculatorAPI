package com.example.calculator.model.request;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CalculatorRequest {

    private Double number1;
    private Double number2;
    private Integer typeCalculator;
}
