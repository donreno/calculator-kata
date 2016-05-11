package com.nisum.secretmeetings.calculatorkata;


import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;


public class CalculatorTest {

    private Calculator calculator;


    @Before
    public void setUp() throws Exception {
        calculator = new Calculator();
    }


    @Test
    public void shouldReturnTheSameNumberOnSingleNumberInput() throws Exception {
        assertEquals(7, calculator.calculate("7"));
        assertEquals(8, calculator.calculate("8"));
        assertEquals(-42, calculator.calculate("-42"));
        assertEquals(Integer.MAX_VALUE, calculator.calculate("2147483647"));
        assertEquals(Integer.MIN_VALUE, calculator.calculate("-2147483648"));
    }


    @Test
    public void shouldSumTwoNumbers() throws Exception {
        assertThat(calculator.calculate("1+2"), is(3));
        assertThat(calculator.calculate("2+2"), is(4));
        assertThat(calculator.calculate("-2+-2"), is(-4));
    }


    @Test
    public void shouldSumThreeNumbers() throws Exception {
        assertThat(calculator.calculate("2+2+2"), is(6));
        assertThat(calculator.calculate("-2+-2+-2"), is(-6));
    }


    @Test
    public void shouldSumFourNumbers() throws Exception {
        assertThat(calculator.calculate("1+2+3+4"), is(10));
        assertThat(calculator.calculate("-1+-2+-3+-4"), is(-10));
    }

    //TODO restar dos números
}










