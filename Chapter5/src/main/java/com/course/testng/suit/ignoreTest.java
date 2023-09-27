package com.course.testng.suit;

import org.testng.annotations.Test;

public class ignoreTest {

    @Test
    public void testCase1(){
        System.out.println("ignore 1 run...");
    }

    @Test(enabled = false)
    public void testCase2(){
        System.out.println("ignore 2 run...");
    }

    @Test(enabled = true)
    public void testCase3(){
        System.out.println("ignore 3 run....");
    }
}
