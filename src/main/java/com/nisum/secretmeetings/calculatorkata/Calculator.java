package com.nisum.secretmeetings.calculatorkata;


import static java.lang.Integer.parseInt;


public class Calculator {

    public int calculate(String input) {
        if (input.contains("+")) {
            String[] numbers = input.split("\\+");

            int total = 0;

            for (String numberAsString : numbers) {
                total += parseInt(numberAsString);
            }

            return total;
        } else {
            return parseInt(input);
        }
    }
}
