package com.course.testng.paramter;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.lang.reflect.Method;

public class DataProviderTest {

    @Test(dataProvider = "data")
    public void testDataProvider(String name, int age){
        System.out.println("name: "+ name + "; age: " + age);
    }

    @DataProvider(name= "data")
    public Object[][] providerData(){
        Object[][] o = new Object[][]{
                {"zhangsan", 20},
                {"lisi", 30},
                {"wangwu", 40}
        };
        return o;
    }



    @Test(dataProvider="methodData")
    public void testDataProvider1(String name, int age){
        System.out.println("testcase1 name: " + name + "; age: " + age);
    }


    @Test(dataProvider="methodData")
    public void testDataProvider2(String name, int age){
        System.out.println("testcase2 name: " + name + "; age: " + age);
    }

    @DataProvider(name = "methodData")
    public Object[][] providerMethodData(Method method){
        Object[][] objects = null;
        if(method.getName().equals("testDataProvider1")) {
            objects =new Object[][]{
                    {"zhangsan", 22},
                    {"lisi", 33},
                    {"wangwu", 44}
            };
        }else if(method.getName().equals("testDataProvider2")){
            objects =new Object[][]{
                    {"zhangsan", 99},
                    {"lisi", 88},
                    {"wangwu", 77}
            };
        }
        return objects;
    }


}
