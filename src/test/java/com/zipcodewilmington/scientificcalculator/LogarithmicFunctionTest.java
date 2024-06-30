package com.zipcodewilmington.scientificcalculator;

import junit.framework.TestCase;
import org.junit.Assert;

public class LogarithmicFunctionTest extends TestCase {

    public void testBaseLog() {
        LogarithmicFunction logarithmicFunction = new LogarithmicFunction();
        double actualResult = LogarithmicFunction.baseLog(5,3);
        double expectedResult = 1.4649735207;
        Assert.assertEquals(expectedResult,actualResult,0.5);
    }

    public void testNaturalLog() {
        LogarithmicFunction logarithmicFunction = new LogarithmicFunction();
        double actualResult = LogarithmicFunction.naturaLog(6.2);
        double expectedResult = 1.8245492920510458;
        Assert.assertEquals(expectedResult, actualResult,0.5);
    }

    public void testNegNaturalLog() {
        LogarithmicFunction logarithmicFunction = new LogarithmicFunction();
        double actualResult = LogarithmicFunction.negNaturalLog(3.24);
        double expectedResult = 1737.8008287494;
        Assert.assertEquals(expectedResult, actualResult, 0.5);
    }

    public void testNegBaseLog() {
        LogarithmicFunction logarithmicFunction = new LogarithmicFunction();
        double actualResult = LogarithmicFunction.negBaseLog(3.24, 5.4);
        double expectedResult = 571.403709053;
        Assert.assertEquals(expectedResult, actualResult, 0.5);
    }
}