package com.zipcodewilmington.scientificcalculator;

import junit.framework.TestCase;
import org.junit.Assert;

public class MemoryTest extends TestCase {

    public void testGetAndSetMemory() {

        double expected = 2.34234;
        Memory memory = new Memory();
        memory.setMemory(expected);
        double actual = memory.getMemory();
        Assert.assertEquals(actual, expected,0.5);

    }



    public void testClearMemory() {
        Memory memory = new Memory();
        double value = 28;
        value = memory.clearMemory(value);
        double expected = 0;
        Assert.assertEquals(expected, value, 0.5);
    }
}