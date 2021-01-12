package com.clin.chace.demo.proxy;

import org.springframework.cglib.core.DebuggingClassWriter;
import sun.misc.ProxyGenerator;

import java.io.FileOutputStream;
import java.lang.reflect.Proxy;

public class ProxyTest {

    /*static{
        //将cglib生产的class写入本地，然后再使用idea反编译查看，写入static即保证在运行期执行
        System.setProperty(DebuggingClassWriter.DEBUG_LOCATION_PROPERTY, "/Users/vipkid/Documents/workspace/clin/workspace/javaspace/chace-demo/src/main/java/com/clin/chace/demo/proxy/cglib_out");
    }*/

    public static void main(String[] args) {
        CglibProxy cglibProxy = new CglibProxy();
        TestService target = new TestServiceImpl("chace");
        /*TestService testProxy = (TestService) cglibProxy.getInstance(target);
        testProxy.say();*/

        TestService dymanicTestProxy = (TestService) Proxy.newProxyInstance(TestService.class.getClassLoader(),
                new Class[]{TestService.class}, new DynamicProxy(target));
        dymanicTestProxy.say();

        /*try {
            byte[] $Proxy0s = ProxyGenerator.generateProxyClass("$Proxy0", new Class[]{DynamicProxy.class});
            FileOutputStream fileOutputStream = new FileOutputStream("/Users/vipkid/Documents/workspace/clin/workspace/javaspace/chace-demo/src/main/java/com/clin/chace/demo/proxy/dynamic/$Proxy0.class");
            fileOutputStream.write($Proxy0s);
            fileOutputStream.close();
        } catch (Exception e) {
            e.printStackTrace();
        }*/

    }
}
