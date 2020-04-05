package com.example.homework5;



import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;


@RunWith(JUnit4.class)
public class CalculatorTest {
    private Calculator mCalculator;

    @Before
    public void setUp() {
        mCalculator = new Calculator();
    }

    @Test
    public void powTwoNumbersWithPostiveInteger() {
        int resultPow = (int) mCalculator.pow(2, 3);
        assertThat(resultPow, is(equalTo(8)));
    }

    @Test
    public void powTwoNumbersWithNegativeIntegerFirstOperand() {
        int resultPow = (int) mCalculator.pow(-2, 3);
        assertThat(resultPow, is(equalTo(-8)));
    }

    @Test
    public void powTwoNumbersWithNegativeIntegerSecondOperand() {
        double resultPow = mCalculator.pow(2, -3);
        assertThat(resultPow, is(equalTo(0.125)));
    }

    @Test
    public void powTwoNumbersWithZeroFirstOperandPositiveIntegerSecondOperand() {
        double resultPow = mCalculator.pow(0, 3);
        assertThat(resultPow, is(equalTo(0d)));
    }

    @Test
    public void powTwoNumbersWithPositiveFirstOperandZeroSecondOperand() {
        double resultPow = mCalculator.pow(2, 0);
        assertThat(resultPow, is(equalTo(1d)));
    }

    @Test(expected = IllegalArgumentException.class)
    public void powTwoNumbersWithZeroFirstOperandMinusOneSecondOperand() {
        double resultPow = mCalculator.pow(0, -1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void powTwoNumbersWithZeroFirstOperandAnyNegativeSecondOperand() {
        double resultPow = mCalculator.pow(-0, -3);
    }

    @Test
    public void addTwoNumbers() {
        double resultAdd = mCalculator.add(1d, 1d);
        assertThat(resultAdd, is(equalTo(2d)));
    }

    @Test
    public void addTwoNumbersNegative() {
        double resultAdd = mCalculator.add(-1d, 2d);
        assertThat(resultAdd, is(equalTo(1d)));
    }

    @Test
    public void addTwoNumbersWorksWithNegativeResult() {
        double resultAdd = mCalculator.add(-1d, -17d);
        assertThat(resultAdd, is(equalTo(-18d)));
    }

    @Test
    public void addTwoNumbersFloats() {
        double resultAdd = mCalculator.add(1.111d, 1.111d);
        assertThat(resultAdd, is(equalTo(2.222)));
    }

    @Test
    public void addTwoNumbersBignums() {
        double resultAdd = mCalculator.add(123456781d, 111111111d);
        assertThat(resultAdd, is(equalTo(234567892d)));
    }

    @Test
    public void subTwoNumbers() {
        double resultSub = mCalculator.sub(1d, 1d);
        assertThat(resultSub, is(equalTo(0d)));
    }

    @Test
    public void subWorksWithNegativeResult() {
        double resultSub = mCalculator.sub(1d, 17d);
        assertThat(resultSub, is(equalTo(-16d)));
    }

    @Test
    public void divTwoNumbers() {
        double resultDiv = mCalculator.div(32d,2d);
        assertThat(resultDiv, is(equalTo(16d)));
    }

    @Test(expected = IllegalArgumentException.class)
    public void divDivideByZeroThrows() {
        mCalculator.div(32d,0d);
    }

    @Test
    public void mulTwoNumbers() {
        double resultMul = mCalculator.mul(32d, 2d);
        assertThat(resultMul, is(equalTo(64d)));
    }
}
