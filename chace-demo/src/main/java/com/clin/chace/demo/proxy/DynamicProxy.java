package com.clin.chace.demo.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class DynamicProxy implements InvocationHandler {

    private Object delegate;

    public DynamicProxy(Object delegate) {
        this.delegate = delegate;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("In proxy");
        Object result = method.invoke(delegate, args);
        System.out.println("Exit proxy");
        return result;
    }

    public Object getProxy(ClassLoader cl, Class clazz) {
        return Proxy.newProxyInstance(cl, new Class[]{clazz}, this);
    }

    public static void main(String[] args) {
        TestService ts = new TestServiceImpl("chace");

        if (ts instanceof TestService) {
            System.out.println("创建了一个TestService");
        }

        TestService proxy = (TestService) new DynamicProxy(ts).getProxy(TestService.class.getClassLoader(), TestService.class);

        proxy.say();

        if (proxy instanceof TestService) {
            System.out.println("创建的代理也是TestService");
        }
    }
}
