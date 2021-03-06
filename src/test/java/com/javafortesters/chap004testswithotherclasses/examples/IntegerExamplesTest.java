package com.javafortesters.chap004testswithotherclasses.examples;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class IntegerExamplesTest {


    @Test
    public void integerExploration() {

        Integer four = new Integer(4);
    }

    @Test
    public void canConvertIntToHex() {
        assertEquals("hex 10 is b", "a",
                Integer.toHexString(10));

    }

    @Test
    public void IsMinMAXValue(){

        int min = -2147483648;
        int max = 2147483647;

        assertEquals("MIN value equals -2147483648", min, Integer.MIN_VALUE);
        assertEquals("MAX value equals 2147483647", max, Integer.MAX_VALUE);
    }

    @Test
    public void IsMinMAXValue2(){

       int min2 = Integer.MIN_VALUE;
       int max2 = Integer.MAX_VALUE;


        assertEquals("MIN value equals -2147483648", -2147483648, min2);
        assertEquals("MAX value equals 2147483647", 2147483647, max2);
    }

}
