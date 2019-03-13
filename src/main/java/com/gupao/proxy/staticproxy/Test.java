package com.gupao.proxy.staticproxy;

import com.gupao.proxy.BuyHouseImpl;
import com.gupao.proxy.IBuyHouse;

/**
 * Created by xuhuan on 2019/3/13.
 */
public class Test {
    public static void main(String[] args) {
        IBuyHouse buyHouse = new BuyHouseImpl();
        buyHouse.buyHouse();

        IBuyHouse buyHouseProxy = new BuyHouseProxy(buyHouse);
        buyHouseProxy.buyHouse();
    }
}
