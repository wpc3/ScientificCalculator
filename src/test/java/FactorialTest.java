package com.zipcodewilmington.scientificcalculator;

import junit.framework.TestCase;
import org.junit.Assert;

public class FactorialTest extends TestCase {

    public void testGetFactorialofNumbers(){
        Factorial facotorialTest = new Factorial();
        double value = 6;
        double expectedResult = 720;
        double actualResult = Factorial.getFactorialOfNumbers(6);
        Assert.assertEquals(expectedResult, actualResult, 0.5);

        double value2 = 5.5;
        double expectedResult2 = 120;
        double actualResult2 = Factorial.getFactorialOfNumbers(5.5);
        Assert.assertEquals(expectedResult2, actualResult2, 0.5);


    }
}