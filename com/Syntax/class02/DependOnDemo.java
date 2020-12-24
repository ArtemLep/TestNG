package com.Syntax.class02;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependOnDemo {
    @Test
    public void login(){
        System.out.println("I am a login in");

        Assert.assertTrue(false);
    }
    @Test(dependsOnMethods = "login" )
    public void addEmployee(){
        System.out.println("I am adding Employee");
    }
  /*  @Test
    public void test3(){
        System.out.println("I am a test 3");
    }*/
}
