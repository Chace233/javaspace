package com.clin.mybatis.demo.plugins;

import org.apache.ibatis.executor.Executor;
import org.apache.ibatis.mapping.MappedStatement;
import org.apache.ibatis.plugin.*;
import org.apache.ibatis.session.ResultHandler;
import org.apache.ibatis.session.RowBounds;

import java.util.Properties;


@Intercepts(
        @Signature(type = Executor.class, method = "query", args = {MappedStatement.class,Object.class, RowBounds.class, ResultHandler.class})
)
public class TestPlugin implements Interceptor {

    @Override
    public Object intercept(Invocation invocation) throws Throwable {
        System.out.println("成功拦截了Executor.query方法，执行一些逻辑");
        return invocation.proceed();
    }

    @Override
    public Object plugin(Object o) {
        return Plugin.wrap(o, this);
    }

    @Override
    public void setProperties(Properties properties) {
        System.out.println("自定义属性:userName->" + properties.getProperty("userName"));
    }
}
