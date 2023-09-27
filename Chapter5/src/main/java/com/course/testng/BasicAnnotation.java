package com.course.testng;

import org.testng.annotations.*;

/**
 * 基本注解实战
 */
public class BasicAnnotation {

    @Test
    public void testCase1(){
        System.out.println("this is case1");
    }

    @Test
    public void testCase2(){
        System.out.println("this is case 2");
    }

    @BeforeMethod
    public void beforeMethod(){
        System.out.println("This is before method ");
    }

    @AfterMethod
    public void afterMethod(){
        System.out.println("This is after method");
    }

    @BeforeClass
    public void beforeClass(){
        System.out.println("This is before class.....");
    }

    @AfterClass
    public void afterClass(){
        System.out.println("This is after class .....");
    }

    @BeforeSuite
    public void beforeSuit(){
        System.out.println("This is before suit");
    }

    @AfterSuite
    public void afterSuit(){
        System.out.println("This is after suit");
    }

//    @BeforeGroups
//    public void beforeGroup(){
//        System.out.println("This is before group");
//    }
//
//    @AfterGroups
//    public void afterGroup(){
//        System.out.println("This is after group");
//    }
}
