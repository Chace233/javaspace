package com.clin.chace.demo.classloader;

import java.net.URL;
import java.net.URLClassLoader;

public class DependenceTest {

    public static void main(String[] args) {
        String v1dir = "file:///Users/vipkid/Documents/workspace/clin/workspace/javaspace/chace-demo/src/main/java/com/clin/chace/demo/classloader/v1/";
        String v2dir = "file:///Users/vipkid/Documents/workspace/clin/workspace/javaspace/chace-demo/src/main/java/com/clin/chace/demo/classloader/v2/";
        try {
            URLClassLoader v1 = new URLClassLoader(new URL[]{new URL(v1dir)});
            URLClassLoader v2 = new URLClassLoader(new URL[]{new URL(v2dir)});

            Class<?> depv1Class = v1.loadClass("DiamondDependence");
            Object depv1 = depv1Class.getConstructor().newInstance();
            depv1Class.getMethod("print").invoke(depv1);

            Class<?> depv2Class = v2.loadClass("DiamondDependence");
            Object depv2 = depv2Class.getConstructor().newInstance();
            depv2Class.getMethod("print").invoke(depv2);

            System.out.println(depv1Class.equals(depv2Class));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
