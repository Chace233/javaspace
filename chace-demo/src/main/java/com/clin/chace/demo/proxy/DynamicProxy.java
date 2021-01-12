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
}
