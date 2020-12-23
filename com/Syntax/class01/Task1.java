package com.Syntax.class01;

import org.testng.annotations.*;

public class Task1 {
    @BeforeClass
    public void beforeClass() {
        System.out.println("I am before class");

    }

    @BeforeMethod
    public void beforeMethod() {
        System.out.println("I am before method");
    }

    @Test
    public void test() {
        System.out.println("I am a test method");
    }

    @Test
    public void test2() {
        System.out.println("I am the second test method");
    }

    @AfterMethod
    public void afterMethod() {
        System.out.println("I am after method");
    }

    @AfterClass
    public void afterClass() {
        System.out.println("I am the after class");
    }
}