package com.course.testng.multiThread;

import org.testng.annotations.Test;

public class MultiThreadOnXml {

    @Test
    public void testCase1(){
        System.out.println(1);
        System.out.printf("Thread Id: %s%n", Thread.currentThread().getId());
    }

    @Test
    public void testCase2(){
        System.out.println(1);
        System.out.printf("Thread Id: %s%n", Thread.currentThread().getId());
    }

    @Test
    public void testCase3(){
        System.out.println(1);
        System.out.printf("Thread Id: %s%n", Thread.currentThread().getId());
    }
}
