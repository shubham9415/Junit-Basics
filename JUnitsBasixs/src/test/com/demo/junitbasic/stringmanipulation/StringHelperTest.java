package com.demo.junitbasic.stringmanipulation;

import com.demo.junitbasic.stringmanipulation.StringHelper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public class StringHelperTest {

    StringHelper helper = new StringHelper();

    String input;
    String actual;

    public StringHelperTest(String expected, String actual) {
        this.input = expected;
        this.actual = actual;
    }

    @Parameterized.Parameters
    public static Collection<String[]> testParameters(){
        String parameters[] [] = {{"AACD", "CD"}, {"AAD", "D"}};
        return Arrays.asList(parameters);
    }

    @Test
    public void testFirst2Positions(){
        assertEquals(actual,helper.truncateAInFirst2Positions(input));
    }

    @Test
    public void  testareFirstAndLastTwoCharactersTheSame(){
        assertFalse(helper.areFirstAndLastTwoCharactersTheSame("ABCD"));
    }

}