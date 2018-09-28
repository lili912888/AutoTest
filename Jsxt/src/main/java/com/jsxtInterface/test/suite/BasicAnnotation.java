package com.jsxtInterface.test.suite;


import org.testng.annotations.*;

public class BasicAnnotation {
   //最基本的注解，用来把方法标记为测试的一部分
    @Test
    public void testCase1(){
      System.out.println("测试");
    }

    @BeforeMethod
    public void beforeMethod(){
     System.out.println("BeforeMethod");
    }

   @BeforeSuite
    public void beforSuit(){
       System.out.println("beforSuit");

   }

    @AfterSuite
    public void  afterSuit(){
        System.out.println("AfterSuite");


    }
}

