package com.clin.chace.demo.proxy;

public class StaticProxy implements TestService {

    private TestServiceImpl test;

    public StaticProxy(TestServiceImpl test) {
        if (test.getClass() == TestServiceImpl.class) {
            this.test = test;
        }
    }

    @Override
    public void say() {
        System.out.println("StaticProxy say");
        test.say();
    }

    public static void main(String[] args) {
        TestServiceImpl test = new TestServiceImpl("chace");
        StaticProxy proxy = new StaticProxy(test);

        proxy.say();
    }
}
