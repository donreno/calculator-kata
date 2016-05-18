package com.nisum.secretmeetings.calculatorkata;


import java.util.regex.Pattern;

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
            if (input.contains("-")) {
                Pattern pattern = Pattern.compile("(\\-)?d+(\\-d+)*");



                String[] numbers = input.split("\\-");

                int total = 0;

                for (String numberAsString : numbers) {
                    if (numberAsString.isEmpty()){
                        continue;
                    }

                    total += parseInt("-" + numberAsString);
                }

                return total;
            }

            return parseInt(input);
        }

    }
}

