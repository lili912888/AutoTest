package com.jsxtInterface.test.groups;

import org.testng.annotations.Test;

@Test(groups = "stu")
public class GroupOnClasss2 {

    public void stu1(){
        System.out.println("GroupOnClasss2-stu1");
    }
    public void stu2(){
        System.out.println("GroupOnClasss2-stu2");
    }
}
