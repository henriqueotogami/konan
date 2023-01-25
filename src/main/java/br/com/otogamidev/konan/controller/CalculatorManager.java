package br.com.otogamidev.konan.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/calculator")
public class CalculatorManager {

    /**
     * URL -> http://localhost:8080/calculator/add/{firstNumber}/{secondNumber}
     * @param firstNumber Primeiro número da adição.
     * @param secondNumber Segundo número da adição.
     * @return Retorna a adição entre o firstNumber e o secondNumber.
     */
    @GetMapping("/add/{firstNumber}/{secondNumber}")
    public String addition(@PathVariable final int firstNumber, @PathVariable final int secondNumber) {
        return "Sum result="
                .concat(String.valueOf(firstNumber)).concat ("+")
                .concat(String.valueOf(secondNumber)).concat("=")
                .concat(String.valueOf((firstNumber + secondNumber)));
    }

    /**
     * URL -> http://localhost:8080/calculator/subtract?firstNumber=30&secondNumber=28
     * @param firstNumber Primeiro número da subtração.
     * @param secondNumber Segundo número da subtração.
     * @return Retorna a subtração entre o firstNumber e o secondNumber.
     */
    @GetMapping("/subtract")
    public String subtract(@RequestParam(name="firstNumber") final int firstNumber,
                           @RequestParam(name="secondNumber") final int secondNumber) {
        return "Subtract result="
                .concat(String.valueOf(firstNumber)).concat ("-")
                .concat(String.valueOf(secondNumber)).concat("=")
                .concat(String.valueOf((firstNumber - secondNumber)));
    }
}
