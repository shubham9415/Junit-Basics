package com.demo.junitbasic.stringmanipulation;

import com.demo.junitbasic.stringmanipulation.StringHelper;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class BeforeAndAfterTest {
    StringHelper helperTest;

    @Before
    public void beforeMethod(){
        System.out.println("Before is executed");
        helperTest = new StringHelper();
    }

    @After
    public void afterIsExecuted(){
        System.out.println("After is executed");
    }

    @Test
    public void test1(){
        Assert.assertEquals("CD", helperTest.truncateAInFirst2Positions("ABCD"));
        System.out.println("Hello There First Scenario");
    }

    @Test
    public void  test2(){
        Assert.assertTrue("Failed due to expected outcome not proper",helperTest.areFirstAndLastTwoCharactersTheSame("ABCDABC"));
    }
}
