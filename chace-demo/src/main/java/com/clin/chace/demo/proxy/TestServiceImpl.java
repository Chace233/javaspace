package com.clin.chace.demo.proxy;

public class TestServiceImpl implements TestService {

    private String name;

    public TestServiceImpl() {

    }

    public TestServiceImpl(String name) {
        this.name = name;
    }

    public void say() {
        System.out.println(name);
    }
}
