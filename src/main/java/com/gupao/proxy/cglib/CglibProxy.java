package com.gupao.proxy.cglib;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * Created by xuhuan on 2019/3/13.
 */
public class CglibProxy implements MethodInterceptor {

    private Object object;
    public Object getInstance(final Object object){
        this.object = object;
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(this.object.getClass());
        enhancer.setCallback(this);

        return enhancer.create();
    }

    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("买房前借钱");
        Object object = method.invoke(this.object,objects);
        System.out.println("买房后还钱");
        return object;
    }
}
