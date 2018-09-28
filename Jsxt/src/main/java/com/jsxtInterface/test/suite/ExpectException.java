package com.jsxtInterface.test.suite;

import org.testng.annotations.Test;

public class ExpectException {
    /**
     *
     */
    // 这是一个测试结果会失败的异常测试
   @Test(expectedExceptions = RuntimeException.class)
    public  void  runTimeExceptionFailed(){
        System.out.println("这是一个测试结果失败的异常测试");
    }

    // 这是一个测试结果会成功的异常测试
    @Test(expectedExceptions = RuntimeException.class)
    public  void  runTimeExceptionSuccess(){
        System.out.println("这是一个测试结果成功的异常测试");
        throw  new RuntimeException();

    }
}
