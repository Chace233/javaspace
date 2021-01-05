package com.clin.chace.demo.logic.SingleInstance;

/**
 * 懒汉式-单例
 * 线程安全
 * 调用效率不高，但是能延迟加载
 */
public class SingleDemo2 {

    private static SingleDemo2 instance;

    private SingleDemo2() {

    }

    public static synchronized SingleDemo2 getInstance() {
        if (instance == null) {
            instance = new SingleDemo2();
        }
        return instance;
    }
}
