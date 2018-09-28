package com.jsxtInterface.test.suite;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class SuiteConfig {
    @BeforeSuite
    public void beforeSuit(){
        System.out.println("beforeusite11");
    }
   @AfterSuite
    public void afterSuite(){
        System.out.println("afterSuite");
    }
}
