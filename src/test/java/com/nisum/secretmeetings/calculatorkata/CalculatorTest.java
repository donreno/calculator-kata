package com.nisum.secretmeetings.calculatorkata;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;
import static junit.framework.TestCase.assertNotNull;

public class CalculatorTest {

    @Test
    public void shouldCreateCalculatorInstance(){
        Calculator calculator = new Calculator();
        assertNotNull(calculator);
    }

    @Test
    public void shouldReturnTheSameNumberOnSingleNumberInput(){
        Calculator calculator = new Calculator();
        assertEquals(7, calculator.calculate("7"));
        assertEquals(8, calculator.calculate("8"));
    }

}
