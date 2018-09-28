package com.jsxtInterface.test.groups;

import org.testng.annotations.Test;

@Test(groups = "stu")
public class GroupOnClasss1 {

    public void stu1(){
      System.out.println("GroupOnClasss1-stu1");
    }
    public void stu2(){
        System.out.println("GroupOnClasss1-stu2");
    }
}
