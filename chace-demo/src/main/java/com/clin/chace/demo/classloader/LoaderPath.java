package com.clin.chace.demo.classloader;

import java.net.URL;

public class LoaderPath {

    public static void main(String[] args) {
        System.out.println("BootstrapClassLoader加载哪些类：");
        URL[] urLs = sun.misc.Launcher.getBootstrapClassPath().getURLs();
        for (URL url : urLs) {
            System.out.println(url.toExternalForm());
        }

        try {
            Class<?> c = Class.forName("[i");
            System.out.println(c);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        try {
            Class<?> c2 = ClassLoader.getSystemClassLoader().loadClass("[i");
            System.out.println(c2);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
