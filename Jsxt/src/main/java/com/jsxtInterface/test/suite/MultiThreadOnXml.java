package com.jsxtInterface.test.suite;

import org.testng.annotations.Test;

public class MultiThreadOnXml {

  @Test
    public  void  tes1(){
         System.out.printf("Thread1 Id: %s%n",Thread.currentThread().getId());
    }

    @Test
    public void  test2(){
      System.out.printf("Thread2 Id : %s%n",Thread.currentThread().getId());
    }

    @Test
    public void  test3(){
        System.out.printf("Thread3 Id : %s%n",Thread.currentThread().getId());
    }
}
