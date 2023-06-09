/*
 * Copyright (c) 2017 maoyan.com
 * All rights reserved.
 *
 */
package com.test.testng.Lesson0Annotation;

import org.testng.annotations.*;

/**
 * 注解使用
 *
 * @author binger
 * @created 2018/8/27
 */
public class TestAnnotation1 {
    @BeforeTest
    public void beforeTest() {
        System.out.println("**********TestAnnotation1--Test执行之前操作【比类BeforeClass靠前】**********");
    }

    @AfterTest
    public void afterTest() {
        System.out.println("==========TestAnnotation1--Test执行之后操作【比类AfterClass靠后】==========");
    }

    @BeforeClass
    public void beforeClass() {
        System.out.println("**********TestAnnotation1--【当前类TestAnnotation1】Class执行之前操作**********");
    }

    @AfterClass
    public void afterClass() {
        System.out.println("==========TestAnnotation1--【当前类TestAnnotation1】Class执行之后操作==========");
    }

    @BeforeMethod
    public void beforeMethod() {
        System.out.println("**********TestAnnotation1--【当前类TestAnnotation1-每一个】Method执行之前操作**********");
    }

    @AfterMethod
    public void afterMethod() {
        System.out.println("==========TestAnnotation1--【当前类TestAnnotation1-每一个】Method执行之后操作==========");
    }

    @Test
    public void testMethod1() {
        System.out.println("==========TestAnnotation1--testMethod1执行==========");
    }

    @Test
    public void testMethod2() {
        System.out.println("==========TestAnnotation1--testMethod2执行==========");
    }
}
