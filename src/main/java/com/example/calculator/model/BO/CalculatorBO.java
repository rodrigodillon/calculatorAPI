package com.example.calculator.model.BO;

import com.example.calculator.model.request.CalculatorRequest;
import com.example.calculator.model.response.CalculatorResponse;
import lombok.NoArgsConstructor;

@NoArgsConstructor
public class CalculatorBO {

    public CalculatorResponse calculating (CalculatorRequest calculatorRequest ) {
        CalculatorResponse calculatorResponse = new CalculatorResponse();
        if ( calculatorRequest.getTypeCalculator() == 1 ) {
            calculatorResponse.setResult(calculatorRequest.getNumber1() + calculatorRequest.getNumber2());
        } else {
            calculatorResponse.setResult(calculatorRequest.getNumber1() - calculatorRequest.getNumber2());
        }
        return calculatorResponse;
    }
}
