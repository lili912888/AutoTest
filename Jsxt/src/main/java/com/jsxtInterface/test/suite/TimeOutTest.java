package com.jsxtInterface.test.suite;

import org.testng.annotations.Test;

public class TimeOutTest {
    @Test(timeOut = 3000) //单位毫秒
    public  void  testSuccess() throws  InterruptedException{

         Thread.sleep(3000);

    }
}
