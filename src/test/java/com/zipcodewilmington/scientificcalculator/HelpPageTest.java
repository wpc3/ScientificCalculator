package com.zipcodewilmington.scientificcalculator;

import junit.framework.TestCase;
import org.junit.Assert;

public class HelpPageTest extends TestCase {

    public void helpTest() {

        String expected = "<*><*><*><*><*><*><*><*><*><*><*><*>" + "\n" +
                "You can specificy if you need: " + "\n" +
                "\"--DEG\" to switch to degrees " + "\n" +
                "\"--operator help\" for operator" + "\n" +
                "symbols" + "\n" +
                "\"--memory help\" for storing or  " + "\n" +
                "clearing or recalling values in mem" + "\n" +
                "<*><*><*><*><*><*><*><*><*><*><*><*>";
        HelpPage helpPage = new HelpPage();
        String input = "help";
        String actual = helpPage.getHelpOperators(input);

//        expected.equals(actual);
        assertEquals(expected,actual);


    }

}