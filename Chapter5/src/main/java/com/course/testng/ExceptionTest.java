package com.course.testng;

import org.testng.annotations.Test;

/**
 * 什么时候会用到异常测试？
 * 在我们期望结果为某一个异常的时候
 * 比如我们传入某些不合法的参数，程序抛出了异常
 * 也就是说我们的运行结果就是一个异常
 */
public class ExceptionTest {

    // 这个是测试结果失败的case
    @Test(expectedExceptions = RuntimeException.class)
    public void runTimeExceptionFailed(){
        System.out.println("this is exception failed case ");
    }

    // 这是一个测试成功的case
    @Test(expectedExceptions = RuntimeException.class)
    public void runTimeExceptionSuccessfully() {
        System.out.println("this is my exception case ");
        throw new RuntimeException();
    }
}
