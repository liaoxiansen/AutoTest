package com.course.testng;

import org.testng.annotations.Test;

public class DependTest {
    @Test
    public void testCase1(){
        System.out.println("run testcase 1....");
        // 失败的情况下，case2 会ignored
//        throw new RuntimeException();
    }
    @Test(dependsOnMethods = {"testCase1"})
    public void testCase2(){
        System.out.println("run testcase 2...");
    }
}
