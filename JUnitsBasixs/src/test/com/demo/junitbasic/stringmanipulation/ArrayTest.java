package com.demo.junitbasic.stringmanipulation;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class ArrayTest {

    @Test
    public void testArray(){
        int a[]= { 45, 87 , 22, 12};
        int b []={12,22,45,87};
        Arrays.sort(a);
        Assert.assertArrayEquals(b,a);
    }

    @Test(expected = NullPointerException.class)
    public void testArray2(){
        // Try to catch the Exception,
        // as in case of JUnit it's a feature that one successful run means that the test case is success.
        int a[] = {78,7878,32};
        Arrays.sort(a);
    }

    @Test(timeout = 1)
    public void  testPerformance(){
        int a[] = { 53, 232, 322,1212, 323};
        for(int i = 0; i < 1000000000;i++){
            Arrays.sort(a);
        }
    }
}
