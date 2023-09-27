package com.extentreport.demo;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestExtentReport {

    @Test
    public void testcase1(){
        Assert.assertEquals(1,2);
    }

    @Test
    public void testcase2(){
        Assert.assertEquals(1,1);
    }

    @Test
    public void testcase3(){
        Assert.assertEquals(2,2);
    }

    @Test
    public void logDemo(){
        Reporter.log("这是我们自己写的异常");
        throw new RuntimeException("这是我们自己的运行的异常");
    }
}
