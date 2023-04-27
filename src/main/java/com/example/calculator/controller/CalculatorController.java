package com.example.calculator.controller;

import com.example.calculator.model.BO.CalculatorBO;
import com.example.calculator.model.request.CalculatorRequest;
import com.example.calculator.model.response.CalculatorResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("calculator")
@CrossOrigin(origins = "http://localhost:3000")
public class CalculatorController {


    @PostMapping
    public ResponseEntity<CalculatorResponse> calculator(@RequestBody CalculatorRequest calculatorRequest) {
        try {
            CalculatorBO calculatorBO = new CalculatorBO();
            return ResponseEntity.ok().body(calculatorBO.calculating(calculatorRequest));
        } catch (Exception e) {
            return ResponseEntity.noContent().build();
        }

    }

}
