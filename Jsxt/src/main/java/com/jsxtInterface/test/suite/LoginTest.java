package com.jsxtInterface.test.suite;

import org.testng.annotations.Test;

public class LoginTest {

    @Test
    public void loginTaoBao(){
      System.out.println("longin");
    }

    @Test(enabled = false)
    public void loginIngnore(){
        System.out.println("hulue");
    }
}
