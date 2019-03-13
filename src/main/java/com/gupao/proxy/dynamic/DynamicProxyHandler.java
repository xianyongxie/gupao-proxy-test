package com.gupao.proxy.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Created by xuhuan on 2019/3/13.
 */
public class DynamicProxyHandler implements InvocationHandler {

    private Object object;
    public DynamicProxyHandler(final Object object){
        this.object = object;
    }

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("买房前借钱");
        Object object = method.invoke(this.object,args);
        System.out.println("买房后还钱");
        return object;
    }
}
