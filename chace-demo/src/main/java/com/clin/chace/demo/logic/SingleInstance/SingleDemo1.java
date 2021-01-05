package com.clin.chace.demo.logic.SingleInstance;

/**
 * 饿汉式-单例
 * 单例在还没有使用的时候就创建出来了，缺点也很明显，容易造成资源浪费
 */
public class SingleDemo1 {

    private static SingleDemo1 instance = new SingleDemo1();

    private SingleDemo1() {

    }

    public static SingleDemo1 getInstance() {
        return instance;
    }
}
