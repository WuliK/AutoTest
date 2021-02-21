package com.course.testng.groups;

import org.testng.annotations.Test;

@Test(groups = "tch")
public class GroupsOnClass3 {

    public void tch1(){
        System.out.println("GroupsOnClass3中的tch1运行");
    }

    public void tch2(){
        System.out.println("GroupsOnClass3中的tch2运行");
    }
}
