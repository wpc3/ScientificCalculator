package com.zipcodewilmington.scientific_calculator;

import com.zipcodewilmington.scientificcalculator.Arithmetic;

import org.junit.Assert;
import org.junit.Test;

public class mathTest {

    @Test
    public void onePlusOneEqualsTwo(){
        Arithmetic arithmetic = new Arithmetic();
        double actualResult = arithmetic.addition(1,1);
        double expectedResult = 2;
        Assert.assertEquals(expectedResult,actualResult,.5);
    }

    @Test
    public void threeMinusOneEqualsTwo(){
        Arithmetic arithmetic = new Arithmetic();
        double actualResult = arithmetic.subtraction(3,1);
        double expectedResult = 2;
        Assert.assertEquals(expectedResult,actualResult,.5);
    }

    @Test
    public void fiveTimesTwoEqualsTen(){
        Arithmetic arithmetic = new Arithmetic();
        double actualResult = arithmetic.multiplication(5,2);
        double expectedResult = 10;
        Assert.assertEquals(expectedResult,actualResult,.5);
    }

    @Test
    public void tenDividedByTwoEqualsFive(){
        Arithmetic arithmetic = new Arithmetic();
        double actualResult = arithmetic.division(10,2);
        double expectedResult = 5;
        Assert.assertEquals(expectedResult,actualResult,.5);
    }

    @Test
    public void fivePowerOfTwoEqualsTwentyFive(){
        Arithmetic arithmetic = new Arithmetic();
        double actualResult = arithmetic.power(5,2);
        double expectedResult = 25;
        Assert.assertEquals(expectedResult,actualResult,.5);
    }

    @Test
    public void sixSquaredEqualsThirtySix(){
        Arithmetic arithmetic = new Arithmetic();
        double actualResult = arithmetic.square(6);
        double expectedResult = 36;
        Assert.assertEquals(expectedResult,actualResult,.5);
    }

    @Test
    public void nineSquareRootEqualsThree(){
        Arithmetic arithmetic = new Arithmetic();
        double actualResult = arithmetic.squareRoot(9);
        double expectedResult = 3;
        Assert.assertEquals(expectedResult,actualResult,.5);
    }

    @Test
    public void fourInversedEqualsPointTwentyFive(){
        Arithmetic arithmetic = new Arithmetic();
        double actualResult = arithmetic.inverse(4);
        double expectedResult = .25;
        Assert.assertEquals(expectedResult,actualResult,.5);
    }

    @Test
    public void negativeAndPositiveNumbers(){
        Arithmetic arithmetic = new Arithmetic();
        double actualResult = arithmetic.posAndNeg(9);
        double expectedResult = -9;
        Assert.assertEquals(expectedResult,actualResult,.5);
    }

    @Test
    public void sinOfHundredEqualsNegativePointFiveZero(){
        Arithmetic arithmetic = new Arithmetic();
        double actualResult = arithmetic.sin(100);
        double expectedResult = -.506;
        Assert.assertEquals(expectedResult,actualResult, .5);
    }

    @Test
    public void cosineHundredEqualsPointEightSixTwo(){
        Arithmetic arithmetic = new Arithmetic();
        double actualResult = arithmetic.cosine(100);
        double expectedResult = .862;
        Assert.assertEquals(expectedResult,actualResult,.5);
    }

    @Test
    public void tangentHundredEqualsNegativePointFiveEight(){
        Arithmetic arithmetic = new Arithmetic();
        double actualResult = arithmetic.tangent(100);
        double expectedResult = -.587;
        Assert.assertEquals(expectedResult,actualResult,.5);
    }

    @Test
    public void inverseSinOfHundredEqualsNegativeOnePointNineSeven(){
        Arithmetic arithmetic = new Arithmetic();
        double actualResult = arithmetic.inverseSin(100);
        double expectedResult = -1.974;
        Assert.assertEquals(expectedResult,actualResult, .5);
    }

    @Test
    public void inverseCosineHundredEqualsOnePointFiveNine(){
        Arithmetic arithmetic = new Arithmetic();
        double actualResult = arithmetic.inverseCosine(100);
        double expectedResult = 1.159;
        Assert.assertEquals(expectedResult,actualResult,.5);
    }

    @Test
    public void inverseTangentHundredEqualsNegativeOnePointSevenZeroTwo(){
        Arithmetic arithmetic = new Arithmetic();
        double actualResult = arithmetic.inverseTangent(100);
        double expectedResult = -1.702;
        Assert.assertEquals(expectedResult,actualResult,.5);
    }


















}
