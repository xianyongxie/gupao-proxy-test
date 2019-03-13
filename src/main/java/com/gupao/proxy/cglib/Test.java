package com.gupao.proxy.cglib;

import com.gupao.proxy.BuyHouseImpl;
import com.gupao.proxy.IBuyHouse;

/**
 * Created by xuhuan on 2019/3/13.
 */
public class Test {

    public static void main(String[] args){
        IBuyHouse buyHouse = new BuyHouseImpl();
        CglibProxy cglibProxy = new CglibProxy();
        BuyHouseImpl buyHouseCglibProxy = (BuyHouseImpl) cglibProxy.getInstance(buyHouse);
        buyHouseCglibProxy.buyHouse();
    }
}
