package com.course.testng.suit;

import org.testng.annotations.*;

public class SuitConfig {
    @BeforeSuite
    public void beforeSuit(){
        System.out.println("before suit 运行了。。。。");
    }

    @AfterSuite
    public void afterSuit(){
        System.out.println("after suit 运行了。。。。。");
    }

    @BeforeTest
    public void beforeTest(){
        System.out.println("This is before test ");
    }

    @AfterTest
    public void afterTest(){
        System.out.println("This is after test");
    }
}
