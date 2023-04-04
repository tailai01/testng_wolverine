/*
 * Copyright (c) 2017 maoyan.com
 * All rights reserved.
 *
 */
package com.test.testng.Lesson0Annotation;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

/**
 * 定义suite执行之前与执行之后的操作
 *
 * @author binger
 * @created 2018/8/27
 */
public class TestSuite {
    // 整个suite执行执行前执行，同一个文件夹下面？
    @BeforeSuite
    public void beforeSuite() {
        System.out.println("==========Suite执行之前操作==========");
    }

    // 在整个suite执行之后再执行，是不是可以清理数据？
    @AfterSuite
    public void afterSuite() {
        System.out.println("==========Suite执行之后操作==========");
    }
}