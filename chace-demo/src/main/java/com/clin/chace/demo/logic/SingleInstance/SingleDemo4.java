package com.clin.chace.demo.logic.SingleInstance;

/**
 * 静态内部类实现模式
 * 线程安全 调用效率高 可以延时加载
 */
public class SingleDemo4 {

    private static class SingletonClassInstance {
        private static final SingleDemo4 instance = new SingleDemo4();
    }

    private SingleDemo4() {

    }

    public static SingleDemo4 getInstance() {
        return SingletonClassInstance.instance;
    }
}
