package com.course.testng.multiThread;

import org.testng.annotations.Test;

public class MultiTrreadOnAnnotation {

    @Test(invocationCount = 10, threadPoolSize = 3)
    public void testCase(){
        System.out.println(1);
        System.out.printf("Thread Id: %s%n", Thread.currentThread().getId());
    }
}
