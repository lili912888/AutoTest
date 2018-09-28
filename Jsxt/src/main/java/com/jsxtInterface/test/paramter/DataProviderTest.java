package com.jsxtInterface.test.paramter;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.lang.reflect.Method;

public class DataProviderTest {
    @Test(dataProvider = "data")
    public void testDataProvider(String name, int age) {
        System.out.println("name=" + name + "; age=" + age);

    }

    @DataProvider(name = "data")
    public Object[][] providerData() {
        Object[][] o = new Object[][]{{"zhangsan", 10}, {"lisi", 20}, {"lisi2", 30}};
        return o;
    }


    @Test(dataProvider = "methodData")
    public void test1(String name, int age) {
        System.out.println("test1 :name=" + name + "; age=" + age);

    }

    @Test(dataProvider = "methodData")
    public void test2(String name, int age) {
        System.out.println("test2 :name=" + name + "; age=" + age);

    }

    @DataProvider(name = "methodData")
    public Object[][] methodDataTest(Method method) {
        Object[][] restult = null;
        if (method.getName().equals("test1")) {
            restult = new Object[][]{
                    {"zhangsan", 20},
                    {"lisi", 25}
            };
        } else if (method.getName().equals("test2")) {
            restult = new Object[][]{
                    {"wangwu", 57},
                    {"xiaoliu", 67}
            };

        }
        return restult;
    }
}