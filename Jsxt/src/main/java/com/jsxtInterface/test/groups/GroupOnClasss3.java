package com.jsxtInterface.test.groups;

import org.testng.annotations.Test;

@Test(groups = "teacher")
public class GroupOnClasss3 {
    public void teach1(){
        System.out.println("GroupOnClasss3-teach1");
    }
    public void teach2(){
        System.out.println("GroupOnClasss3-teach2");
    }
}
