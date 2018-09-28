package com.jsxtInterface.test.groups;

import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

public class GroupsOnMethod {
    @Test(groups = "server")
    public  void test1(){
     System.out.println("服务端测试1111");
    }

    @Test(groups = "server")
    public void test2(){
        System.out.println("服务端测试2222");
    }

    @Test(groups = "client")
    public void test3(){
        System.out.println("客户端1111");
    }

    @Test(groups = "client")
    public void test4(){
        System.out.println("客户端2222");
    }

    @BeforeGroups(groups = "server")
    public  void  beforeGroupsOnServer(){
        System.out.println("beforeGroupsOnServer");
    }

    @AfterGroups(groups = "server")
    public  void  afterGroupsOnServer(){
        System.out.println("afterGroupsOnServer");
    }
}
