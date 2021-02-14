package com.clin.chace.demo.despatch;

public class StaticDespatch {

    static abstract class Human {
    }

    static class Man extends Human {

    }

    static class Woman extends Human {

    }

    public void sayHello(Human guy) {
        System.out.println("hello, guy!");
    }

    public void sayHello(Man guy) {
        System.out.println("hello, gentleman!");
    }

    public void sayHello(Woman guy) {
        System.out.println("hello, lady!");
    }

    public static void main(String[] args) {
        Human man = new Man();
        Human woman = new Woman();
        StaticDespatch sd = new StaticDespatch();
        sd.sayHello(man);
        sd.sayHello(woman);

        Man man1 = new Man();
        sd.sayHello(man1);

        Woman woman1 = new Woman();
        sd.sayHello(woman1);
    }
}
