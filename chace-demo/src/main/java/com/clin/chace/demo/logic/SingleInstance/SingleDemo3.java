package com.clin.chace.demo.logic.SingleInstance;

/**
 * double check-单例
 * 偶尔会出现问题，不建议使用
 */
public class SingleDemo3 {

    private volatile static SingleDemo3 instance;

    private SingleDemo3() {

    }

    public static SingleDemo3 getInstance() {
        if (instance == null) {
            synchronized (SingleDemo3.class) {
                if (instance == null) {
                    instance = new SingleDemo3();
                }
            }
        }
        return instance;
    }
}
