package com.course.testng.groups;

import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

public class GroupsOnMethod {

    @Test(groups = "server")
    public void testCase1(){
        System.out.println("this is server case1");
    }

    @Test(groups = "server")
    public void testCase2(){
        System.out.println("this is server case2");
    }

    @Test(groups = "client")
    public void testCase3(){
        System.out.println("this is client case3");
    }

    @Test(groups = "client")
    public void testCase4(){
        System.out.println("this is client case4");
    }

    @BeforeGroups("server")
    public void beforeGroups(){
        System.out.println("this is before server groups...... ");
    }

    @AfterGroups("server")
    public void afterGroups(){
        System.out.println("this is after server groups......");
    }



    @BeforeGroups("client")
    public void beforeGroupsOnClient(){
        System.out.println("this is before client groups...... ");
    }

    @AfterGroups("client")
    public void afterGroupsOnClient(){
        System.out.println("this is after client groups......");
    }

}
