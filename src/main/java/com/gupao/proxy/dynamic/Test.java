package com.gupao.proxy.dynamic;

import com.gupao.proxy.BuyHouseImpl;
import com.gupao.proxy.IBuyHouse;
import com.gupao.proxy.staticproxy.BuyHouseProxy;

import java.lang.reflect.Proxy;

/**
 * Created by xuhuan on 2019/3/13.
 */
public class Test {
    public static void main(String[] args) {
        IBuyHouse buyHouse = new BuyHouseImpl();
        IBuyHouse buyHouseProxy = (IBuyHouse) Proxy.newProxyInstance(IBuyHouse.class.getClassLoader(),
                new Class[]{IBuyHouse.class},
                new DynamicProxyHandler(buyHouse));

        buyHouseProxy.buyHouse();
    }
}
